package io.mycat.myweb.autogen.bean;
public class ERRelation {
    public final String tableName;
    public final String foreignKey;
	public final String parentTable;
	private String parentDomain;
	public ERRelation(String tableName, String foreignKey, String parentTable) {
		this.tableName = tableName;
		this.foreignKey = foreignKey;
		this.parentTable = parentTable;
	}

	public String getParentDomain() {
		return parentDomain;
	}

	public void setParentDomain(String parentDomain) {
		this.parentDomain = parentDomain;
	}

	
}