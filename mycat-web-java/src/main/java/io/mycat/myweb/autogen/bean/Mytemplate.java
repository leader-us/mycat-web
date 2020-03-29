package io.mycat.myweb.autogen.bean;

import java.util.HashMap;
import java.util.Map;

public class Mytemplate {

    public static Map<String, Mytemplate> templates = new HashMap<>();
    static {
        templates.put("domain", new Mytemplate("domain", "/templates/domain.ftl", "/src/main/java/", ".java"));
        templates.put("dao", new Mytemplate("dao", "/templates/dao.ftl", "/src/main/java/", "Dao.java"));
        templates.put("service",
                new Mytemplate("service", "/templates/service.ftl", "/src/main/java/", "Service.java"));
        templates.put("rest", new Mytemplate("rest", "/templates/rest.ftl", "/src/main/java/", "Rest.java"));
        templates.put("front", new Mytemplate("rest", "rest.ftl", "static/", ".vue"));
    }
    private String packageName;
    private String templateFile;
    private String targetDir;
    private String fileSufix;

    public Mytemplate(String packageName, String templateFile, String targetDir, String fileSufix) {
        this.packageName = packageName;
        this.templateFile = templateFile;
        this.targetDir = targetDir;
        this.fileSufix = fileSufix;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getTemplateFile() {
        return templateFile;
    }

    public void setTemplateFile(String templateFile) {
        this.templateFile = templateFile;
    }

    public String getTargetDir() {
        return targetDir;
    }

    public void setTargetDir(String targetDir) {
        this.targetDir = targetDir;
    }

    public String getFileSufix() {
        return fileSufix;
    }

    public void setFileSufix(String fileSufix) {
        this.fileSufix = fileSufix;
    }

}
