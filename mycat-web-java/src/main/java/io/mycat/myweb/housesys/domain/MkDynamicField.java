package io.mycat.myweb.housesys.domain;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

/**
 * mk_dynamic_field
 * 
 * @author leader
 * @email leader@mycat.io
 * @date Fri Mar 27 23:53:48 CST 2020
 */

@Table("mk_dynamic_field")
public class  MkDynamicField {

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
	 * 表ID
	 */
    
	@Column("table_id")
	private Long tableId;
    /**
	 * 表名称
	 */
    
	@Column("field_name")
	private String fieldName;
    /**
	 * 文本描述
	 */
    
	@Column("field_text")
	private String fieldText;
    /**
	 * 字段类型
	 */
    
	@Column("field_type")
	private String fieldType;
    /**
	 * 可选值
	 */
    
	@Column("field_value")
	private String fieldValue;
    /**
	 * 英文名称
	 */
    
	@Column("en_name")
	private String enName;


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
	 * 设置：表ID
	 */
	public void setTableId(Long tableId) {
		this.tableId = tableId;
	}
	/**
	 * 获取：表ID
	 */
    public Long isTableId() {
		return tableId;
	}
	/**
	 * 设置：表名称
	 */
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	/**
	 * 获取：表名称
	 */
    public String isFieldName() {
		return fieldName;
	}
	/**
	 * 设置：文本描述
	 */
	public void setFieldText(String fieldText) {
		this.fieldText = fieldText;
	}
	/**
	 * 获取：文本描述
	 */
    public String isFieldText() {
		return fieldText;
	}
	/**
	 * 设置：字段类型
	 */
	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}
	/**
	 * 获取：字段类型
	 */
    public String isFieldType() {
		return fieldType;
	}
	/**
	 * 设置：可选值
	 */
	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}
	/**
	 * 获取：可选值
	 */
    public String isFieldValue() {
		return fieldValue;
	}
	/**
	 * 设置：英文名称
	 */
	public void setEnName(String enName) {
		this.enName = enName;
	}
	/**
	 * 获取：英文名称
	 */
    public String isEnName() {
		return enName;
	}

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }
}