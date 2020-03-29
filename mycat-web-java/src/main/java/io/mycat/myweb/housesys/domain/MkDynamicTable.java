package io.mycat.myweb.housesys.domain;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

/**
 * mk_dynamic_table
 * 
 * @author leader
 * @email leader@mycat.io
 * @date Fri Mar 27 23:53:48 CST 2020
 */

@Table("mk_dynamic_table")
public class  MkDynamicTable {

    /**
	 * 主键，
	 */
    @Id
    
	@Column("id")
	private Long id;
    /**
	 * 创建日期
	 */
    
	@Column("create_date")
	private java.util.Date createDate;
    /**
	 * 表名称
	 */
    
	@Column("table_name")
	private String tableName;
    /**
	 * 表CODE
	 */
    
	@Column("table_code")
	private String tableCode;


	/**
	 * 设置：主键，
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：主键，
	 */
    public Long isId() {
		return id;
	}
	/**
	 * 设置：创建日期
	 */
	public void setCreateDate(java.util.Date createDate) {
		this.createDate = createDate;
	}
	/**
	 * 获取：创建日期
	 */
    public java.util.Date isCreateDate() {
		return createDate;
	}
	/**
	 * 设置：表名称
	 */
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	/**
	 * 获取：表名称
	 */
    public String isTableName() {
		return tableName;
	}
	/**
	 * 设置：表CODE
	 */
	public void setTableCode(String tableCode) {
		this.tableCode = tableCode;
	}
	/**
	 * 获取：表CODE
	 */
    public String isTableCode() {
		return tableCode;
	}

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }
}