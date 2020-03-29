package io.mycat.myweb.housesys.domain;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

/**
 * t_user
 * 
 * @author leader
 * @email leader@mycat.io
 * @date Fri Mar 27 23:53:48 CST 2020
 */

@Table("t_user")
public class  TUser {

    /**
	 * 主键，用户id
	 */
    @Id
    
	@Column("id")
	private Long id;
    /**
	 * 用户名
	 */
    
	@Column("account")
	private String account;
    /**
	 * 真实姓名
	 */
    
	@Column("realname")
	private String realname;
    /**
	 * 昵称
	 */
    
	@Column("nickname")
	private String nickname;
    /**
	 * QQ号
	 */
    
	@Column("qq")
	private String qq;
    /**
	 * 邮箱
	 */
    
	@Column("email")
	private String email;
    /**
	 * 博客地址
	 */
    
	@Column("website")
	private String website;
    /**
	 * 王的梦想
	 */
    
	@Column("dream")
	private String dream;
    /**
	 * 积分
	 */
    
	@Column("points")
	private Integer points;
    /**
	 * 信誉平均分
	 */
    
	@Column("credit_points")
	private Integer creditPoints;
    /**
	 * 干粮余额
	 */
    
	@Column("balance")
	private Long balance;
    /**
	 * 创建日期
	 */
    
	@Column("create_time")
	private java.util.Date createTime;


	/**
	 * 设置：主键，用户id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：主键，用户id
	 */
    public Long isId() {
		return id;
	}
	/**
	 * 设置：用户名
	 */
	public void setAccount(String account) {
		this.account = account;
	}
	/**
	 * 获取：用户名
	 */
    public String isAccount() {
		return account;
	}
	/**
	 * 设置：真实姓名
	 */
	public void setRealname(String realname) {
		this.realname = realname;
	}
	/**
	 * 获取：真实姓名
	 */
    public String isRealname() {
		return realname;
	}
	/**
	 * 设置：昵称
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	 * 获取：昵称
	 */
    public String isNickname() {
		return nickname;
	}
	/**
	 * 设置：QQ号
	 */
	public void setQq(String qq) {
		this.qq = qq;
	}
	/**
	 * 获取：QQ号
	 */
    public String isQq() {
		return qq;
	}
	/**
	 * 设置：邮箱
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 获取：邮箱
	 */
    public String isEmail() {
		return email;
	}
	/**
	 * 设置：博客地址
	 */
	public void setWebsite(String website) {
		this.website = website;
	}
	/**
	 * 获取：博客地址
	 */
    public String isWebsite() {
		return website;
	}
	/**
	 * 设置：王的梦想
	 */
	public void setDream(String dream) {
		this.dream = dream;
	}
	/**
	 * 获取：王的梦想
	 */
    public String isDream() {
		return dream;
	}
	/**
	 * 设置：积分
	 */
	public void setPoints(Integer points) {
		this.points = points;
	}
	/**
	 * 获取：积分
	 */
    public Integer isPoints() {
		return points;
	}
	/**
	 * 设置：信誉平均分
	 */
	public void setCreditPoints(Integer creditPoints) {
		this.creditPoints = creditPoints;
	}
	/**
	 * 获取：信誉平均分
	 */
    public Integer isCreditPoints() {
		return creditPoints;
	}
	/**
	 * 设置：干粮余额
	 */
	public void setBalance(Long balance) {
		this.balance = balance;
	}
	/**
	 * 获取：干粮余额
	 */
    public Long isBalance() {
		return balance;
	}
	/**
	 * 设置：创建日期
	 */
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建日期
	 */
    public java.util.Date isCreateTime() {
		return createTime;
	}

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }
}