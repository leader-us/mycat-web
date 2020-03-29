package io.mycat.myweb.housesys.domain;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

/**
 * mk_auto_input
 * 
 * @author leader
 * @email leader@mycat.io
 * @date Fri Mar 27 23:53:48 CST 2020
 */

@Table("mk_auto_input")
public class  MkAutoInput {

    /**
	 * 主键，
	 */
    @Id
    
	@Column("id")
	private Long id;
    /**
	 * 
	 */
    
	@Column("create_date")
	private java.util.Date createDate;
    /**
	 * key
	 */
    
	@Column("auto_key")
	private String autoKey;
    /**
	 * 
	 */
    
	@Column("incr")
	private Integer incr;


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
	 * 设置：
	 */
	public void setCreateDate(java.util.Date createDate) {
		this.createDate = createDate;
	}
	/**
	 * 获取：
	 */
    public java.util.Date isCreateDate() {
		return createDate;
	}
	/**
	 * 设置：key
	 */
	public void setAutoKey(String autoKey) {
		this.autoKey = autoKey;
	}
	/**
	 * 获取：key
	 */
    public String isAutoKey() {
		return autoKey;
	}
	/**
	 * 设置：
	 */
	public void setIncr(Integer incr) {
		this.incr = incr;
	}
	/**
	 * 获取：
	 */
    public Integer isIncr() {
		return incr;
	}

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }
}