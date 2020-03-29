package io.mycat.myweb.housesys.domain;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

/**
 * wh_user
 * 
 * @author leader
 * @email leader@mycat.io
 * @date Fri Mar 27 23:53:48 CST 2020
 */

@Table("wh_user")
public class  WhUser {

    /**
	 * 主键，
	 */
    @Id
    
	@Column("id")
	private Long id;
    /**
	 * 手机号
	 */
    
	@Column("phone")
	private String phone;
    /**
	 * 姓名
	 */
    
	@Column("uname")
	private String uname;
    /**
	 * 微信号
	 */
    
	@Column("wechat")
	private String wechat;
    /**
	 * 联系电话
	 */
    
	@Column("phonenumber")
	private String phonenumber;
    /**
	 * 岗位（用户自己填写，医护人员，后勤保障，其他）
	 */
    
	@Column("position")
	private String position;
    /**
	 * 公司
	 */
    
	@Column("company")
	private String company;
    /**
	 * 4=志愿者，3=酒店人员，2=求助者 1=管理人员
	 */
    
	@Column("role")
	private Short role;
    /**
	 * 状态：1=已核实，0=未知，2=禁用
	 */
    
	@Column("state")
	private Short state;
    /**
	 * 创建日期
	 */
    
	@Column("create_date")
	private java.util.Date createDate;
    /**
	 * OPENID
	 */
    
	@Column("openid")
	private String openid;
    /**
	 * 密码
	 */
    
	@Column("pwd")
	private String pwd;


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
	 * 设置：姓名
	 */
	public void setUname(String uname) {
		this.uname = uname;
	}
	/**
	 * 获取：姓名
	 */
    public String isUname() {
		return uname;
	}
	/**
	 * 设置：微信号
	 */
	public void setWechat(String wechat) {
		this.wechat = wechat;
	}
	/**
	 * 获取：微信号
	 */
    public String isWechat() {
		return wechat;
	}
	/**
	 * 设置：联系电话
	 */
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	/**
	 * 获取：联系电话
	 */
    public String isPhonenumber() {
		return phonenumber;
	}
	/**
	 * 设置：岗位（用户自己填写，医护人员，后勤保障，其他）
	 */
	public void setPosition(String position) {
		this.position = position;
	}
	/**
	 * 获取：岗位（用户自己填写，医护人员，后勤保障，其他）
	 */
    public String isPosition() {
		return position;
	}
	/**
	 * 设置：公司
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * 获取：公司
	 */
    public String isCompany() {
		return company;
	}
	/**
	 * 设置：4=志愿者，3=酒店人员，2=求助者 1=管理人员
	 */
	public void setRole(Short role) {
		this.role = role;
	}
	/**
	 * 获取：4=志愿者，3=酒店人员，2=求助者 1=管理人员
	 */
    public Short isRole() {
		return role;
	}
	/**
	 * 设置：状态：1=已核实，0=未知，2=禁用
	 */
	public void setState(Short state) {
		this.state = state;
	}
	/**
	 * 获取：状态：1=已核实，0=未知，2=禁用
	 */
    public Short isState() {
		return state;
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
	 * 设置：OPENID
	 */
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	/**
	 * 获取：OPENID
	 */
    public String isOpenid() {
		return openid;
	}
	/**
	 * 设置：密码
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	/**
	 * 获取：密码
	 */
    public String isPwd() {
		return pwd;
	}

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }
}