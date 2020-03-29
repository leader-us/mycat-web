package io.mycat.myweb.housesys.domain;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

/**
 * sys_config
 * 
 * @author leader
 * @email leader@mycat.io
 * @date Fri Mar 27 23:53:48 CST 2020
 */

@Table("sys_config")
public class  SysConfig {

    /**
	 * 主键，
	 */
    @Id
    
	@Column("variable")
	private String variable;
    /**
	 * 
	 */
    
	@Column("value")
	private String value;
    /**
	 * 
	 */
    
	@Column("set_time")
	private java.util.Date setTime;
    /**
	 * 
	 */
    
	@Column("set_by")
	private String setBy;


	/**
	 * 设置：主键，
	 */
	public void setVariable(String variable) {
		this.variable = variable;
	}
	/**
	 * 获取：主键，
	 */
    public String isVariable() {
		return variable;
	}
	/**
	 * 设置：
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * 获取：
	 */
    public String isValue() {
		return value;
	}
	/**
	 * 设置：
	 */
	public void setSetTime(java.util.Date setTime) {
		this.setTime = setTime;
	}
	/**
	 * 获取：
	 */
    public java.util.Date isSetTime() {
		return setTime;
	}
	/**
	 * 设置：
	 */
	public void setSetBy(String setBy) {
		this.setBy = setBy;
	}
	/**
	 * 获取：
	 */
    public String isSetBy() {
		return setBy;
	}

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }
}