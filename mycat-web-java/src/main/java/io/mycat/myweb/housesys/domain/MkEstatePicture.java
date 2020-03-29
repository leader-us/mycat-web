package io.mycat.myweb.housesys.domain;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

/**
 * mk_estate_picture
 * 
 * @author leader
 * @email leader@mycat.io
 * @date Fri Mar 27 23:53:48 CST 2020
 */

@Table("mk_estate_picture")
public class  MkEstatePicture {

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
	 * é™„ä»¶ID
	 */
    
	@Column("attach_id")
	private Long attachId;
    /**
	 * æ•°æ®ID
	 */
    
	@Column("target_id")
	private Long targetId;
    /**
	 * 1 ç§Ÿæˆ¿ID
	 */
    
	@Column("ctype")
	private Short ctype;
    /**
	 * æ•°æ®æº
	 */
    
	@Column("cindex")
	private Integer cindex;


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
	 * 设置：é™„ä»¶ID
	 */
	public void setAttachId(Long attachId) {
		this.attachId = attachId;
	}
	/**
	 * 获取：é™„ä»¶ID
	 */
    public Long isAttachId() {
		return attachId;
	}
	/**
	 * 设置：æ•°æ®ID
	 */
	public void setTargetId(Long targetId) {
		this.targetId = targetId;
	}
	/**
	 * 获取：æ•°æ®ID
	 */
    public Long isTargetId() {
		return targetId;
	}
	/**
	 * 设置：1 ç§Ÿæˆ¿ID
	 */
	public void setCtype(Short ctype) {
		this.ctype = ctype;
	}
	/**
	 * 获取：1 ç§Ÿæˆ¿ID
	 */
    public Short isCtype() {
		return ctype;
	}
	/**
	 * 设置：æ•°æ®æº
	 */
	public void setCindex(Integer cindex) {
		this.cindex = cindex;
	}
	/**
	 * 获取：æ•°æ®æº
	 */
    public Integer isCindex() {
		return cindex;
	}

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }
}