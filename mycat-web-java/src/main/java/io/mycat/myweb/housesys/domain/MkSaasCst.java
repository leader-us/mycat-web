package io.mycat.myweb.housesys.domain;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

/**
 * mk_saas_cst
 * 
 * @author leader
 * @email leader@mycat.io
 * @date Fri Mar 27 23:53:48 CST 2020
 */

@Table("mk_saas_cst")
public class  MkSaasCst {

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
	 * 用户名
	 */
    
	@Column("username")
	private String username;
    /**
	 * 手机号
	 */
    
	@Column("phone")
	private String phone;
    /**
	 * 微信号
	 */
    
	@Column("wx")
	private String wx;
    /**
	 * 居住人数
	 */
    
	@Column("livecount")
	private Integer livecount;
    /**
	 * 报价
	 */
    
	@Column("price")
	private String price;
    /**
	 * ID
	 */
    
	@Column("targetId")
	private Long targetid;
    /**
	 * 类型
	 */
    
	@Column("ctype")
	private String ctype;
    /**
	 * 性别
	 */
    
	@Column("sex")
	private Long sex;
    /**
	 * 广告来源
	 */
    
	@Column("cfytype")
	private String cfytype;
    /**
	 * 状态
	 */
    
	@Column("state")
	private Short state;
    /**
	 * 客户ID
	 */
    
	@Column("user_id")
	private Long userId;
    /**
	 * 入住时间
	 */
    
	@Column("live_time")
	private String liveTime;
    /**
	 * 管家ID
	 */
    
	@Column("hkid")
	private Long hkid;


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
	 * 设置：用户名
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * 获取：用户名
	 */
    public String isUsername() {
		return username;
	}
	/**
	 * 设置：手机号
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：手机号
	 */
    public String isPhone() {
		return phone;
	}
	/**
	 * 设置：微信号
	 */
	public void setWx(String wx) {
		this.wx = wx;
	}
	/**
	 * 获取：微信号
	 */
    public String isWx() {
		return wx;
	}
	/**
	 * 设置：居住人数
	 */
	public void setLivecount(Integer livecount) {
		this.livecount = livecount;
	}
	/**
	 * 获取：居住人数
	 */
    public Integer isLivecount() {
		return livecount;
	}
	/**
	 * 设置：报价
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	/**
	 * 获取：报价
	 */
    public String isPrice() {
		return price;
	}
	/**
	 * 设置：ID
	 */
	public void setTargetid(Long targetid) {
		this.targetid = targetid;
	}
	/**
	 * 获取：ID
	 */
    public Long isTargetid() {
		return targetid;
	}
	/**
	 * 设置：类型
	 */
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	/**
	 * 获取：类型
	 */
    public String isCtype() {
		return ctype;
	}
	/**
	 * 设置：性别
	 */
	public void setSex(Long sex) {
		this.sex = sex;
	}
	/**
	 * 获取：性别
	 */
    public Long isSex() {
		return sex;
	}
	/**
	 * 设置：广告来源
	 */
	public void setCfytype(String cfytype) {
		this.cfytype = cfytype;
	}
	/**
	 * 获取：广告来源
	 */
    public String isCfytype() {
		return cfytype;
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
	 * 设置：客户ID
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：客户ID
	 */
    public Long isUserId() {
		return userId;
	}
	/**
	 * 设置：入住时间
	 */
	public void setLiveTime(String liveTime) {
		this.liveTime = liveTime;
	}
	/**
	 * 获取：入住时间
	 */
    public String isLiveTime() {
		return liveTime;
	}
	/**
	 * 设置：管家ID
	 */
	public void setHkid(Long hkid) {
		this.hkid = hkid;
	}
	/**
	 * 获取：管家ID
	 */
    public Long isHkid() {
		return hkid;
	}

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }
}