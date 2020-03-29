package io.mycat.myweb.housesys.domain;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

/**
 * mk_saas_cst_connect
 * 
 * @author leader
 * @email leader@mycat.io
 * @date Fri Mar 27 23:53:48 CST 2020
 */

@Table("mk_saas_cst_connect")
public class  MkSaasCstConnect {

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
	 * 客户ID
	 */
    
	@Column("cst_id")
	private Long cstId;
    /**
	 * 沟通内容
	 */
    
	@Column("content")
	private String content;
    /**
	 * 沟通日期
	 */
    
	@Column("connect_date")
	private java.util.Date connectDate;
    /**
	 * 沟通状态
	 */
    
	@Column("state")
	private Short state;
    /**
	 * 管家账号
	 */
    
	@Column("keeper_id")
	private Long keeperId;


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
	 * 设置：客户ID
	 */
	public void setCstId(Long cstId) {
		this.cstId = cstId;
	}
	/**
	 * 获取：客户ID
	 */
    public Long isCstId() {
		return cstId;
	}
	/**
	 * 设置：沟通内容
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：沟通内容
	 */
    public String isContent() {
		return content;
	}
	/**
	 * 设置：沟通日期
	 */
	public void setConnectDate(java.util.Date connectDate) {
		this.connectDate = connectDate;
	}
	/**
	 * 获取：沟通日期
	 */
    public java.util.Date isConnectDate() {
		return connectDate;
	}
	/**
	 * 设置：沟通状态
	 */
	public void setState(Short state) {
		this.state = state;
	}
	/**
	 * 获取：沟通状态
	 */
    public Short isState() {
		return state;
	}
	/**
	 * 设置：管家账号
	 */
	public void setKeeperId(Long keeperId) {
		this.keeperId = keeperId;
	}
	/**
	 * 获取：管家账号
	 */
    public Long isKeeperId() {
		return keeperId;
	}

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }
}