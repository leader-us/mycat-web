package io.mycat.myweb.housesys.domain;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

/**
 * mk_wechat
 * 
 * @author leader
 * @email leader@mycat.io
 * @date Fri Mar 27 23:53:48 CST 2020
 */

@Table("mk_wechat")
public class  MkWechat {

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
	 * appid
	 */
    
	@Column("app_id")
	private String appId;
    /**
	 * appkey
	 */
    
	@Column("app_key")
	private String appKey;
    /**
	 * app_secret
	 */
    
	@Column("app_secret")
	private String appSecret;
    /**
	 * 令牌(Token)
	 */
    
	@Column("token")
	private String token;
    /**
	 * token
	 */
    
	@Column("access_token")
	private String accessToken;
    /**
	 * 
	 */
    
	@Column("expires_in")
	private Integer expiresIn;


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
	 * 设置：appid
	 */
	public void setAppId(String appId) {
		this.appId = appId;
	}
	/**
	 * 获取：appid
	 */
    public String isAppId() {
		return appId;
	}
	/**
	 * 设置：appkey
	 */
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}
	/**
	 * 获取：appkey
	 */
    public String isAppKey() {
		return appKey;
	}
	/**
	 * 设置：app_secret
	 */
	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}
	/**
	 * 获取：app_secret
	 */
    public String isAppSecret() {
		return appSecret;
	}
	/**
	 * 设置：令牌(Token)
	 */
	public void setToken(String token) {
		this.token = token;
	}
	/**
	 * 获取：令牌(Token)
	 */
    public String isToken() {
		return token;
	}
	/**
	 * 设置：token
	 */
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	/**
	 * 获取：token
	 */
    public String isAccessToken() {
		return accessToken;
	}
	/**
	 * 设置：
	 */
	public void setExpiresIn(Integer expiresIn) {
		this.expiresIn = expiresIn;
	}
	/**
	 * 获取：
	 */
    public Integer isExpiresIn() {
		return expiresIn;
	}

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }
}