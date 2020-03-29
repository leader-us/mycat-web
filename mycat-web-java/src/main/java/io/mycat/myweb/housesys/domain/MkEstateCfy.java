package io.mycat.myweb.housesys.domain;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

/**
 * mk_estate_cfy
 * 
 * @author leader
 * @email leader@mycat.io
 * @date Fri Mar 27 23:53:48 CST 2020
 */

@Table("mk_estate_cfy")
public class  MkEstateCfy {

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
	 * 租房ID
	 */
    
	@Column("estate_id")
	private Long estateId;
    /**
	 * 分类ID
	 */
    
	@Column("cfy_id")
	private Long cfyId;


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
	 * 设置：租房ID
	 */
	public void setEstateId(Long estateId) {
		this.estateId = estateId;
	}
	/**
	 * 获取：租房ID
	 */
    public Long isEstateId() {
		return estateId;
	}
	/**
	 * 设置：分类ID
	 */
	public void setCfyId(Long cfyId) {
		this.cfyId = cfyId;
	}
	/**
	 * 获取：分类ID
	 */
    public Long isCfyId() {
		return cfyId;
	}

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }
}