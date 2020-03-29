package io.mycat.myweb.housesys.domain;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

/**
 * mk_advert
 * 
 * @author leader
 * @email leader@mycat.io
 * @date Fri Mar 27 23:53:48 CST 2020
 */

@Table("mk_advert")
public class  MkAdvert {

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
	 * 标题
	 */
    
	@Column("title")
	private String title;
    /**
	 * 跳转地址
	 */
    
	@Column("url")
	private String url;
    /**
	 * 附件ID
	 */
    
	@Column("attach_id")
	private Long attachId;
    /**
	 * 状态
	 */
    
	@Column("state")
	private Short state;
    /**
	 * 排序
	 */
    
	@Column("orderby")
	private Integer orderby;


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
	 * 设置：标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：标题
	 */
    public String isTitle() {
		return title;
	}
	/**
	 * 设置：跳转地址
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * 获取：跳转地址
	 */
    public String isUrl() {
		return url;
	}
	/**
	 * 设置：附件ID
	 */
	public void setAttachId(Long attachId) {
		this.attachId = attachId;
	}
	/**
	 * 获取：附件ID
	 */
    public Long isAttachId() {
		return attachId;
	}
	/**
	 * 设置：状态
	 */
	public void setState(Short state) {
		this.state = state;
	}
	/**
	 * 获取：状态
	 */
    public Short isState() {
		return state;
	}
	/**
	 * 设置：排序
	 */
	public void setOrderby(Integer orderby) {
		this.orderby = orderby;
	}
	/**
	 * 获取：排序
	 */
    public Integer isOrderby() {
		return orderby;
	}

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }
}