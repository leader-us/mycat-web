package io.mycat.myweb.housesys.domain;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

/**
 * wh_hotel
 * 
 * @author leader
 * @email leader@mycat.io
 * @date Fri Mar 27 23:53:48 CST 2020
 */

@Table("wh_hotel")
public class  WhHotel {

    /**
	 * 主键，ID
	 */
    @Id
    
	@Column("id")
	private Long id;
    /**
	 * 关联用户 申请人
	 */
    
	@Column("user_id")
	private Long userId;
    /**
	 * 酒店登录账号
	 */
    
	@Column("phone")
	private String phone;
    /**
	 * 区域ID
	 */
    
	@Column("region_id")
	private Long regionId;
    /**
	 * 酒店名称
	 */
    
	@Column("hotel_name")
	private String hotelName;
    /**
	 * 简称
	 */
    
	@Column("simple_name")
	private String simpleName;
    /**
	 * 类型
	 */
    
	@Column("classify")
	private String classify;
    /**
	 * 早中晚餐饮
	 */
    
	@Column("meal")
	private String meal;
    /**
	 * 地址
	 */
    
	@Column("address")
	private String address;
    /**
	 * 联系人
	 */
    
	@Column("uname")
	private String uname;
    /**
	 * 微信
	 */
    
	@Column("wechat")
	private String wechat;
    /**
	 * 可安排房间数
	 */
    
	@Column("room_count")
	private Integer roomCount;
    /**
	 * 已使用房间数
	 */
    
	@Column("use_room_count")
	private Integer useRoomCount;
    /**
	 * 医务人员是否免费
	 */
    
	@Column("medical_staff_free")
	private Short medicalStaffFree;
    /**
	 * 是否愿意被征用
	 */
    
	@Column("expropriation")
	private Short expropriation;
    /**
	 * 优惠房价
	 */
    
	@Column("discount_price")
	private Double discountPrice;
    /**
	 * 是否有接待
	 */
    
	@Column("reception")
	private Short reception;
    /**
	 * 是否有清洁
	 */
    
	@Column("cleaning")
	private Short cleaning;
    /**
	 * 房间搭配说明
	 */
    
	@Column("collocation_description")
	private String collocationDescription;
    /**
	 * 酒店说明
	 */
    
	@Column("description")
	private String description;


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
	 * 设置：关联用户 申请人
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：关联用户 申请人
	 */
    public Long isUserId() {
		return userId;
	}
	/**
	 * 设置：酒店登录账号
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：酒店登录账号
	 */
    public String isPhone() {
		return phone;
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
	 * 设置：酒店名称
	 */
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	/**
	 * 获取：酒店名称
	 */
    public String isHotelName() {
		return hotelName;
	}
	/**
	 * 设置：简称
	 */
	public void setSimpleName(String simpleName) {
		this.simpleName = simpleName;
	}
	/**
	 * 获取：简称
	 */
    public String isSimpleName() {
		return simpleName;
	}
	/**
	 * 设置：类型
	 */
	public void setClassify(String classify) {
		this.classify = classify;
	}
	/**
	 * 获取：类型
	 */
    public String isClassify() {
		return classify;
	}
	/**
	 * 设置：早中晚餐饮
	 */
	public void setMeal(String meal) {
		this.meal = meal;
	}
	/**
	 * 获取：早中晚餐饮
	 */
    public String isMeal() {
		return meal;
	}
	/**
	 * 设置：地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：地址
	 */
    public String isAddress() {
		return address;
	}
	/**
	 * 设置：联系人
	 */
	public void setUname(String uname) {
		this.uname = uname;
	}
	/**
	 * 获取：联系人
	 */
    public String isUname() {
		return uname;
	}
	/**
	 * 设置：微信
	 */
	public void setWechat(String wechat) {
		this.wechat = wechat;
	}
	/**
	 * 获取：微信
	 */
    public String isWechat() {
		return wechat;
	}
	/**
	 * 设置：可安排房间数
	 */
	public void setRoomCount(Integer roomCount) {
		this.roomCount = roomCount;
	}
	/**
	 * 获取：可安排房间数
	 */
    public Integer isRoomCount() {
		return roomCount;
	}
	/**
	 * 设置：已使用房间数
	 */
	public void setUseRoomCount(Integer useRoomCount) {
		this.useRoomCount = useRoomCount;
	}
	/**
	 * 获取：已使用房间数
	 */
    public Integer isUseRoomCount() {
		return useRoomCount;
	}
	/**
	 * 设置：医务人员是否免费
	 */
	public void setMedicalStaffFree(Short medicalStaffFree) {
		this.medicalStaffFree = medicalStaffFree;
	}
	/**
	 * 获取：医务人员是否免费
	 */
    public Short isMedicalStaffFree() {
		return medicalStaffFree;
	}
	/**
	 * 设置：是否愿意被征用
	 */
	public void setExpropriation(Short expropriation) {
		this.expropriation = expropriation;
	}
	/**
	 * 获取：是否愿意被征用
	 */
    public Short isExpropriation() {
		return expropriation;
	}
	/**
	 * 设置：优惠房价
	 */
	public void setDiscountPrice(Double discountPrice) {
		this.discountPrice = discountPrice;
	}
	/**
	 * 获取：优惠房价
	 */
    public Double isDiscountPrice() {
		return discountPrice;
	}
	/**
	 * 设置：是否有接待
	 */
	public void setReception(Short reception) {
		this.reception = reception;
	}
	/**
	 * 获取：是否有接待
	 */
    public Short isReception() {
		return reception;
	}
	/**
	 * 设置：是否有清洁
	 */
	public void setCleaning(Short cleaning) {
		this.cleaning = cleaning;
	}
	/**
	 * 获取：是否有清洁
	 */
    public Short isCleaning() {
		return cleaning;
	}
	/**
	 * 设置：房间搭配说明
	 */
	public void setCollocationDescription(String collocationDescription) {
		this.collocationDescription = collocationDescription;
	}
	/**
	 * 获取：房间搭配说明
	 */
    public String isCollocationDescription() {
		return collocationDescription;
	}
	/**
	 * 设置：酒店说明
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 获取：酒店说明
	 */
    public String isDescription() {
		return description;
	}

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }
}