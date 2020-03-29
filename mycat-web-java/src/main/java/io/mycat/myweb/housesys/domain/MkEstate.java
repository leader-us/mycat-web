package io.mycat.myweb.housesys.domain;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

/**
 * mk_estate
 * 
 * @author leader
 * @email leader@mycat.io
 * @date Fri Mar 27 23:53:48 CST 2020
 */

@Table("mk_estate")
public class  MkEstate {

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
	 * 名称
	 */
    
	@Column("title")
	private String title;
    /**
	 * 长租价格  月
	 */
    
	@Column("univalent")
	private java.math.BigDecimal univalent;
    /**
	 * 面积
	 */
    
	@Column("acreage")
	private String acreage;
    /**
	 * 城市
	 */
    
	@Column("city")
	private String city;
    /**
	 * 录入人
	 */
    
	@Column("user_id")
	private Long userId;
    /**
	 * 类型
	 */
    
	@Column("ctype")
	private Short ctype;
    /**
	 * 动态属性
	 */
    
	@Column("dyvalue")
	private String dyvalue;
    /**
	 * 超文本
	 */
    
	@Column("content")
	private String content;
    /**
	 * 状态 1 上线 2下线
	 */
    
	@Column("state")
	private Short state;
    /**
	 * 分类 1日租 2公寓
	 */
    
	@Column("cfytype")
	private Short cfytype;
    /**
	 * 户型
	 */
    
	@Column("house_type")
	private String houseType;
    /**
	 * 房间号
	 */
    
	@Column("house_room_num")
	private String houseRoomNum;
    /**
	 * 公寓ID
	 */
    
	@Column("building_id")
	private Long buildingId;
    /**
	 * 房间个数
	 */
    
	@Column("house_type1")
	private Integer houseType1;
    /**
	 * 是否 有水表
	 */
    
	@Column("have_water_meter")
	private Short haveWaterMeter;
    /**
	 * 楼层
	 */
    
	@Column("storey")
	private Integer storey;
    /**
	 * 日租价格  天
	 */
    
	@Column("day_price")
	private java.math.BigDecimal dayPrice;
    /**
	 * 短租价格  月
	 */
    
	@Column("short_price")
	private java.math.BigDecimal shortPrice;
    /**
	 * 视频地址
	 */
    
	@Column("video_url")
	private String videoUrl;


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
	 * 设置：名称
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：名称
	 */
    public String isTitle() {
		return title;
	}
	/**
	 * 设置：长租价格  月
	 */
	public void setUnivalent(java.math.BigDecimal univalent) {
		this.univalent = univalent;
	}
	/**
	 * 获取：长租价格  月
	 */
    public java.math.BigDecimal isUnivalent() {
		return univalent;
	}
	/**
	 * 设置：面积
	 */
	public void setAcreage(String acreage) {
		this.acreage = acreage;
	}
	/**
	 * 获取：面积
	 */
    public String isAcreage() {
		return acreage;
	}
	/**
	 * 设置：城市
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * 获取：城市
	 */
    public String isCity() {
		return city;
	}
	/**
	 * 设置：录入人
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：录入人
	 */
    public Long isUserId() {
		return userId;
	}
	/**
	 * 设置：类型
	 */
	public void setCtype(Short ctype) {
		this.ctype = ctype;
	}
	/**
	 * 获取：类型
	 */
    public Short isCtype() {
		return ctype;
	}
	/**
	 * 设置：动态属性
	 */
	public void setDyvalue(String dyvalue) {
		this.dyvalue = dyvalue;
	}
	/**
	 * 获取：动态属性
	 */
    public String isDyvalue() {
		return dyvalue;
	}
	/**
	 * 设置：超文本
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：超文本
	 */
    public String isContent() {
		return content;
	}
	/**
	 * 设置：状态 1 上线 2下线
	 */
	public void setState(Short state) {
		this.state = state;
	}
	/**
	 * 获取：状态 1 上线 2下线
	 */
    public Short isState() {
		return state;
	}
	/**
	 * 设置：分类 1日租 2公寓
	 */
	public void setCfytype(Short cfytype) {
		this.cfytype = cfytype;
	}
	/**
	 * 获取：分类 1日租 2公寓
	 */
    public Short isCfytype() {
		return cfytype;
	}
	/**
	 * 设置：户型
	 */
	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}
	/**
	 * 获取：户型
	 */
    public String isHouseType() {
		return houseType;
	}
	/**
	 * 设置：房间号
	 */
	public void setHouseRoomNum(String houseRoomNum) {
		this.houseRoomNum = houseRoomNum;
	}
	/**
	 * 获取：房间号
	 */
    public String isHouseRoomNum() {
		return houseRoomNum;
	}
	/**
	 * 设置：公寓ID
	 */
	public void setBuildingId(Long buildingId) {
		this.buildingId = buildingId;
	}
	/**
	 * 获取：公寓ID
	 */
    public Long isBuildingId() {
		return buildingId;
	}
	/**
	 * 设置：房间个数
	 */
	public void setHouseType1(Integer houseType1) {
		this.houseType1 = houseType1;
	}
	/**
	 * 获取：房间个数
	 */
    public Integer isHouseType1() {
		return houseType1;
	}
	/**
	 * 设置：是否 有水表
	 */
	public void setHaveWaterMeter(Short haveWaterMeter) {
		this.haveWaterMeter = haveWaterMeter;
	}
	/**
	 * 获取：是否 有水表
	 */
    public Short isHaveWaterMeter() {
		return haveWaterMeter;
	}
	/**
	 * 设置：楼层
	 */
	public void setStorey(Integer storey) {
		this.storey = storey;
	}
	/**
	 * 获取：楼层
	 */
    public Integer isStorey() {
		return storey;
	}
	/**
	 * 设置：日租价格  天
	 */
	public void setDayPrice(java.math.BigDecimal dayPrice) {
		this.dayPrice = dayPrice;
	}
	/**
	 * 获取：日租价格  天
	 */
    public java.math.BigDecimal isDayPrice() {
		return dayPrice;
	}
	/**
	 * 设置：短租价格  月
	 */
	public void setShortPrice(java.math.BigDecimal shortPrice) {
		this.shortPrice = shortPrice;
	}
	/**
	 * 获取：短租价格  月
	 */
    public java.math.BigDecimal isShortPrice() {
		return shortPrice;
	}
	/**
	 * 设置：视频地址
	 */
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
	/**
	 * 获取：视频地址
	 */
    public String isVideoUrl() {
		return videoUrl;
	}

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }
}