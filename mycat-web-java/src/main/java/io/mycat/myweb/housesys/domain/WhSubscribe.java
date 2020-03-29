package io.mycat.myweb.housesys.domain;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

/**
 * wh_subscribe
 * 
 * @author leader
 * @email leader@mycat.io
 * @date Fri Mar 27 23:53:48 CST 2020
 */

@Table("wh_subscribe")
public class  WhSubscribe {

    /**
	 * 主键，编号
	 */
    @Id
    
	@Column("id")
	private Integer id;
    /**
	 * 用户
	 */
    
	@Column("user_id")
	private Long userId;
    /**
	 * 联系人
	 */
    
	@Column("conn_person")
	private String connPerson;
    /**
	 * 联系电话
	 */
    
	@Column("conn_phone")
	private String connPhone;
    /**
	 * 4=志愿者，3=酒店人员，2=求助者 1=管理人员
	 */
    
	@Column("conn_type")
	private Integer connType;
    /**
	 * 入住人数
	 */
    
	@Column("checkin_num")
	private Integer checkinNum;
    /**
	 * 是否核实
	 */
    
	@Column("checked")
	private Integer checked;
    /**
	 * 开始日期
	 */
    
	@Column("date_begin")
	private java.util.Date dateBegin;
    /**
	 * 结束日期
	 */
    
	@Column("date_end")
	private java.util.Date dateEnd;
    /**
	 * 区域ID
	 */
    
	@Column("region_id")
	private Long regionId;
    /**
	 * 希望地点
	 */
    
	@Column("hope_addr")
	private String hopeAddr;
    /**
	 * 入住原因
	 */
    
	@Column("checkin_reson")
	private String checkinReson;
    /**
	 * 其他说明
	 */
    
	@Column("remark")
	private String remark;
    /**
	 * 创建日期
	 */
    
	@Column("createdate")
	private java.util.Date createdate;
    /**
	 * 酒店ID
	 */
    
	@Column("hotel_id")
	private Long hotelId;
    /**
	 * 医院ID
	 */
    
	@Column("hospital_id")
	private Long hospitalId;
    /**
	 * 关键字
	 */
    
	@Column("keyword")
	private String keyword;


	/**
	 * 设置：主键，编号
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：主键，编号
	 */
    public Integer isId() {
		return id;
	}
	/**
	 * 设置：用户
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户
	 */
    public Long isUserId() {
		return userId;
	}
	/**
	 * 设置：联系人
	 */
	public void setConnPerson(String connPerson) {
		this.connPerson = connPerson;
	}
	/**
	 * 获取：联系人
	 */
    public String isConnPerson() {
		return connPerson;
	}
	/**
	 * 设置：联系电话
	 */
	public void setConnPhone(String connPhone) {
		this.connPhone = connPhone;
	}
	/**
	 * 获取：联系电话
	 */
    public String isConnPhone() {
		return connPhone;
	}
	/**
	 * 设置：4=志愿者，3=酒店人员，2=求助者 1=管理人员
	 */
	public void setConnType(Integer connType) {
		this.connType = connType;
	}
	/**
	 * 获取：4=志愿者，3=酒店人员，2=求助者 1=管理人员
	 */
    public Integer isConnType() {
		return connType;
	}
	/**
	 * 设置：入住人数
	 */
	public void setCheckinNum(Integer checkinNum) {
		this.checkinNum = checkinNum;
	}
	/**
	 * 获取：入住人数
	 */
    public Integer isCheckinNum() {
		return checkinNum;
	}
	/**
	 * 设置：是否核实
	 */
	public void setChecked(Integer checked) {
		this.checked = checked;
	}
	/**
	 * 获取：是否核实
	 */
    public Integer isChecked() {
		return checked;
	}
	/**
	 * 设置：开始日期
	 */
	public void setDateBegin(java.util.Date dateBegin) {
		this.dateBegin = dateBegin;
	}
	/**
	 * 获取：开始日期
	 */
    public java.util.Date isDateBegin() {
		return dateBegin;
	}
	/**
	 * 设置：结束日期
	 */
	public void setDateEnd(java.util.Date dateEnd) {
		this.dateEnd = dateEnd;
	}
	/**
	 * 获取：结束日期
	 */
    public java.util.Date isDateEnd() {
		return dateEnd;
	}
	/**
	 * 设置：区域ID
	 */
	public void setRegionId(Long regionId) {
		this.regionId = regionId;
	}
	/**
	 * 获取：区域ID
	 */
    public Long isRegionId() {
		return regionId;
	}
	/**
	 * 设置：希望地点
	 */
	public void setHopeAddr(String hopeAddr) {
		this.hopeAddr = hopeAddr;
	}
	/**
	 * 获取：希望地点
	 */
    public String isHopeAddr() {
		return hopeAddr;
	}
	/**
	 * 设置：入住原因
	 */
	public void setCheckinReson(String checkinReson) {
		this.checkinReson = checkinReson;
	}
	/**
	 * 获取：入住原因
	 */
    public String isCheckinReson() {
		return checkinReson;
	}
	/**
	 * 设置：其他说明
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：其他说明
	 */
    public String isRemark() {
		return remark;
	}
	/**
	 * 设置：创建日期
	 */
	public void setCreatedate(java.util.Date createdate) {
		this.createdate = createdate;
	}
	/**
	 * 获取：创建日期
	 */
    public java.util.Date isCreatedate() {
		return createdate;
	}
	/**
	 * 设置：酒店ID
	 */
	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}
	/**
	 * 获取：酒店ID
	 */
    public Long isHotelId() {
		return hotelId;
	}
	/**
	 * 设置：医院ID
	 */
	public void setHospitalId(Long hospitalId) {
		this.hospitalId = hospitalId;
	}
	/**
	 * 获取：医院ID
	 */
    public Long isHospitalId() {
		return hospitalId;
	}
	/**
	 * 设置：关键字
	 */
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	/**
	 * 获取：关键字
	 */
    public String isKeyword() {
		return keyword;
	}

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }
}