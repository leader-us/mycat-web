package io.mycat.myweb.autogen.bean;

/**
 * 列的属性
 *
 */
public class ColumnEntity {
	// 列名
	private String columnName;
	// 列名类型
	private String dataType;
	// 列的长度
	private Integer dataLength;
	// 是否允许为空
	private boolean nullable;
	// 列名备注
	private String comments;

	// 属性名称(第一个字母大写)，如：user_name => UserName
	private String attrName;
	// 属性名称(第一个字母小写)，如：user_name => userName
	private String attrname;
	// 属性类型
	private String attrType;
	// auto_increment
	private String extra;
	private ERRelation er;

	public ColumnEntity(String columnName, String dataType, Integer dataLength, boolean nullable, String comments) {
		this.columnName = columnName;
		this.dataType = dataType;
		this.dataLength = dataLength;
		this.nullable = nullable;
		this.comments = comments;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getAttrname() {
		return attrname;
	}

	public void setAttrname(String attrname) {
		this.attrname = attrname;
	}

	public String getAttrName() {
		return attrName;
	}

	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public String getAttrType() {
		return attrType;
	}

	public void setAttrType(String attrType) {
		this.attrType = attrType;
	}

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	public Integer getDataLength() {
		return dataLength;
	}

	public void setDataLength(Integer dataLength) {
		this.dataLength = dataLength;
	}

	public boolean isNullable() {
		return nullable;
	}

	public void setNullable(boolean nullable) {
		this.nullable = nullable;
	}

	public ERRelation getEr() {
		return er;
	}

	public void setEr(ERRelation er) {
		this.er = er;
	}

}
