package io.mycat.myweb.autogen.service;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;

import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.Version;
import io.mycat.dao.util.NameUtil;
import io.mycat.myweb.autogen.bean.ColumnEntity;
import io.mycat.myweb.autogen.bean.ERRelation;
import io.mycat.myweb.autogen.bean.Mytemplate;
import io.mycat.myweb.autogen.bean.TableEntity;

public class CrudGenrator {
  final static Configuration cfg;
  static {
    // Freemarker configuration object
    cfg = new Configuration(new Version("2.3.0"));
  }
  protected String dbUrl;
  protected String dbUser;
  protected String dbPwd;
  protected boolean isAll;
  protected String tables;
  private String table_prex = "";// tb_
  private String packageName = "mydemo";
  private String author = "leader";
  private String email = "leader@mycat.io";
  private Map<String, List<ERRelation>> relations = new HashMap<>();

  public String getDbUrl() {
    return dbUrl;
  }

  public String getDbUser() {
    return dbUser;
  }

  public String getDbPwd() {
    return dbPwd;
  }

  public boolean isAll() {
    return isAll;
  }

  public CrudGenrator() {
  }

  public CrudGenrator(String url, String user, String pwd, String packageName, boolean isAll, String tables,
      List<ERRelation> relations) {
    this.dbUrl = url;
    this.dbUser = user;
    this.dbPwd = pwd;
    this.packageName = packageName;
    this.isAll = isAll;
    this.tables = tables;
    translateRelation(relations);
  }

  private void translateRelation(List<ERRelation> relations2) {
    for (ERRelation er : relations2) {
      List<ERRelation> list = relations.get(er.tableName);
      if (list == null) {
        list = new LinkedList<ERRelation>();
        relations.put(er.tableName, list);
      }
      list.add(er);

    }
  }

  public List<String> getTables() {
    List<String> tableList = new ArrayList<String>();
    if (io.mycat.dao.util.NameUtil.isNotBlank(tables)) {
      tableList.addAll(Arrays.asList(tables.split(",")));
    }
    return tableList;
  }

  private ColumnEntity genColumn(ResultSet rsColumns) throws SQLException {
    String columnName = rsColumns.getString("COLUMN_NAME");
    String columnType = rsColumns.getString("TYPE_NAME");
    String comment = rsColumns.getString("REMARKS");
    int columnSize = rsColumns.getInt("COLUMN_SIZE");
    boolean nullable = rsColumns.getInt("NULLABLE") == 0;
    ColumnEntity columnEntity = new ColumnEntity(columnName, columnType, columnSize, nullable, comment);

    // 列名转换成Java属性名
    String attrName = NameUtil.columnToJava(columnEntity.getColumnName());
    columnEntity.setAttrName(attrName);
    columnEntity.setAttrname(StringUtils.uncapitalize(attrName));
    // 列的数据类型，转换成Java类型
    String attrType = NameUtil.getType(columnEntity.getDataType());
    columnEntity.setAttrType(attrType);
    return columnEntity;
  }

  private String getDomainName(String tableName) {
    return NameUtil.tableToJava(tableName, this.getTable_prex());
  }

  public void generator() throws SQLException, IOException, ClassNotFoundException, TemplateException {
    Connection connection = getConnection();
    DatabaseMetaData metaData = connection.getMetaData();
    String catalog = null, schemaPattern = null, tableNamePattern = null;
    ResultSet tableRet = metaData.getTables(catalog, schemaPattern, tableNamePattern, new String[] { "TABLE" });
    List<String> tableList = getTables();
    List<TableEntity> tableEntityList = new ArrayList<>();
    while (tableRet.next()) {
      String tableName = tableRet.getString("TABLE_NAME");
      if (!isAll && !tableList.contains(tableName)) {
        continue;
      }
      // 表信息
      TableEntity tableEntity = new TableEntity(tableName, tableName);
      // 表名转换成Java类名
      String className = getDomainName(tableName);
      tableEntity.setClassName(className);
      tableEntity.setInstanceName(StringUtils.uncapitalize(className));
      ResultSet rsPK = metaData.getPrimaryKeys(catalog, schemaPattern, tableName);
      ColumnEntity tablePK = null;
      String pKColumn = null;
      int pkcount = 0;
      while (rsPK.next()) {
        pkcount++;
        pKColumn = rsPK.getString("COLUMN_NAME");

      }
      if (pKColumn == null || pkcount != 1) {
        throw new RuntimeException("table " + tableName + " has " + pkcount + " Primary Key ,Leader tell you check !");
      }

      ResultSet rsColumns = metaData.getColumns(catalog, schemaPattern, tableName, null);
      List<ColumnEntity> columsList = new ArrayList<>();
      while (rsColumns.next()) {
        ColumnEntity curCol = genColumn(rsColumns);
        if (pKColumn.equals(curCol.getColumnName())) {
          tablePK = curCol;
        }
        ERRelation er = findTableColumnER(tableName, curCol.getColumnName());
        if (er != null) {
          er.setParentDomain(getDomainName(er.parentTable));
          curCol.setEr(er);
        }
        columsList.add(curCol);
      }
      tablePK.setComments("主键，" + tablePK.getComments());
      tableEntity.setPk(tablePK);
      tableEntity.setColumns(columsList);
      tableEntityList.add(tableEntity);

    }

    for (TableEntity tableEntity : tableEntityList) {
      // 封装模板数据
      Map<String, Object> map = new HashMap<>();
      map.put("tableName", tableEntity.getTableName());
      map.put("comments", tableEntity.getComments());
      map.put("pk", tableEntity.getPk());
      map.put("className", tableEntity.getClassName());
      map.put("instanceName", tableEntity.getInstanceName());
      map.put("pathName", tableEntity.getClassName().toLowerCase());
      map.put("columns", tableEntity.getColumns());
      map.put("mainPath", "mymainpath");
      map.put("package", this.packageName);
      map.put("moduleName", this.getModuleName());
      map.put("author", this.author);
      map.put("email", this.email);
      map.put("datetime", new Date() + "");

      mkdirEntity(map, tableEntity.getClassName(), Mytemplate.templates.get("domain"));
      mkdirEntity(map, tableEntity.getClassName(), Mytemplate.templates.get("dao"));
      // mkdirService(map, tableEntity.getClassName());
      // mkdirServiceImpl(map, tableEntity.getClassName());
    }

  }

  private ERRelation findTableColumnER(String tableName, String foreinCol) {
    List<ERRelation> list = relations.get(tableName);
    if (list == null) {
      return null;
    }
    for (ERRelation er : list) {
      if (er.foreignKey.equalsIgnoreCase(foreinCol)) {
        return er;
      }
    }
    return null;
  }

  // private void mkdirBase(Map<String, Object> hashMap, String fileName) throws
  // IOException, TemplateException {
  // String content =
  // IOUtils.toString(CrudGenrator.class.getResourceAsStream("/JPA/" + fileName +
  // ".ftl"), "UTF-8");
  // String javaFile = generateTemplate(content, hashMap);
  // String codePath = System.getProperty("user.dir") + "/src/main/java/" +
  // path.replace(".", File.separator)
  // + File.separator + "base";
  // File file = new File(codePath);
  // if (!file.exists()) {
  // file.mkdirs();
  // }
  // FileUtils.writeStringToFile(new File(file.getPath() + File.separator +
  // fileName + ".java"), javaFile);
  // }

  private void mkdirEntity(Map<String, Object> hashMap, String entityName, Mytemplate myTemplate)
      throws IOException, TemplateException {
    String content = IOUtils.toString(CrudGenrator.class.getResourceAsStream(myTemplate.getTemplateFile()), "UTF-8");
    String javacontent = generateTemplate(content, hashMap);
    String codePath = System.getProperty("user.dir") + myTemplate.getTargetDir().replace("/", File.separator)
        + packageName.replace(".", File.separator) + File.separator + myTemplate.getPackageName();
    System.out.println("path " + codePath);
    File file = new File(codePath);
    if (!file.exists()) {
      file.mkdirs();
    }
    FileUtils.writeStringToFile(new File(file.getPath() + File.separator + entityName + myTemplate.getFileSufix()),
        javacontent, false);
  }

  private Connection getConnection() throws IOException, SQLException, ClassNotFoundException {
    Connection con;
    // String name = "com.mysql.jdbc.Driver";
    // Class.forName(name);// 指定连接类型
    con = DriverManager.getConnection(dbUrl, dbUser, dbPwd);// 获取连接
    return con;
  }

  private String generateTemplate(String content, Map<String, Object> map) throws IOException, TemplateException {
    StringTemplateLoader sTmpLoader = new StringTemplateLoader();
    String id = UUID.randomUUID().toString();
    sTmpLoader.putTemplate(id, content);
    cfg.setTemplateLoader(sTmpLoader);
    cfg.setDefaultEncoding("UTF-8");
    Template template = cfg.getTemplate(id);
    StringWriter writer = new StringWriter();
    template.process(map, writer);
    return writer.toString();
  }

  /**
   * 获取文件名
   */
  public static String getFileName(String template, String className, String packageName, String moduleName) {
    String packagePath = "main" + File.separator + "java" + File.separator;
    String resourcePath = "main" + File.separator + "resources" + File.separator;
    if (StringUtils.isNotBlank(packageName)) {
      packagePath += packageName.replace(".", File.separator) + File.separator + moduleName + File.separator;
    }

    if (template.contains("Entity.java.vm")) {
      return packagePath + "entity" + File.separator + className + ".java";
    }

    if (template.contains("Service.java.vm")) {
      return packagePath + "service" + File.separator + className + "Service.java";
    }

    if (template.contains("Controller.java.vm")) {
      return packagePath + "controller" + File.separator + className + "Controller.java";
    }
    if (template.contains("Dao.java.vm")) {
      return packagePath + "dao" + File.separator + className + "Dao.java";
    }
    if (template.contains("DaoImpl.java.vm")) {
      return packagePath + "dao" + File.separator + "Impl" + File.separator + className + "DaoImpl.java";
    }
    if (template.contains("swaggerConfig.java.vm")) {
      return packagePath + "config" + File.separator + "swaggerConfig.java";
    }
    if (template.contains("PageRequest.java.vm")) {
      return packagePath + "common" + File.separator + "PageRequest.java";
    }
    if (template.contains("ServerResponse.java.vm")) {
      return packagePath + "common" + File.separator + "ServerResponse.java";
    }
    if (template.contains("ResponseCode.java.vm")) {
      return packagePath + "common" + File.separator + "ResponseCode.java";
    }
    if (template.contains("Pagination.java.vm")) {
      return packagePath + "common" + File.separator + "Pagination.java";
    }
    if (template.contains("application.yml.vm")) {
      return resourcePath + "application.yml";
    }
    return null;
  }

  public String getTable_prex() {
    return table_prex;
  }

  public void setTable_prex(String table_prex) {
    this.table_prex = table_prex;
  }

  public String getModuleName() {
    return StringUtils.substringAfter(packageName, ".");
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
