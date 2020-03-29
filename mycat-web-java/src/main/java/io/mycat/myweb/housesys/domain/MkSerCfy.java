package io.mycat.myweb.housesys.domain;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

/**
 * mk_ser_cfy
 * 
 * @author leader
 * @email leader@mycat.io
 * @date Fri Mar 27 23:53:48 CST 2020
 */

@Table("mk_ser_cfy")
public class  MkSerCfy {

    /**
	 * 主键，ID
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
	 * 附件ID
	 */
    
	@Column("attachid")
	private Long attachid;
    /**
	 * 分类名称
	 */
    
	@Column("cfy_name")
	private String cfyName;


	/**
	 * 设置：主键，ID
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：主键，ID
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
	 * 设置：附件ID
	 */
	public void setAttachid(Long attachid) {
		this.attachid = attachid;
	}
	/**
	 * 获取：附件ID
	 */
    public Long isAttachid() {
		return attachid;
	}
	/**
	 * 设置：分类名称
	 */
	public void setCfyName(String cfyName) {
		this.cfyName = cfyName;
	}
	/**
	 * 获取：分类名称
	 */
    public String isCfyName() {
		return cfyName;
	}

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }
}