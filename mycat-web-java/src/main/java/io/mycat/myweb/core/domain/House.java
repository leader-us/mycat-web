package io.mycat.myweb.core.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

/**
 * 
 * 客房 domain
 *
 */
@Table("house")
public class House {
 
	@Id  
	@Column("id")
	/** 主键id. */
	private Long id;

	/** 标题. */
	@Column(value="title")
	private String title;

	/** 抽成. */
	@Column(value="tip")
	private String tip;

	/** 抽成类型. */
	@Column(value="tip_type")
	private Integer tipType;

	/** 图片. */
	@Column(value="pics")
	private Integer pics;

	/** 视频. */
	@Column(value="video")
	private Integer video;

	/** 构建. */
	@Column(value="buiding")
	private String buiding;

	/** 客房编号. */
	@Column(value="house_no")
	private String houseNo;

	/** 房间类型. */
	@Column(value="house_type")
	private String houseType;

	/** 楼层. */
	@Column(value="layer")
	private Integer layer;

	/** 日租价格. */
	@Column(value="priceday")
	private Double priceday;

	/** 短租价格. */
	@Column(value="price_short")
	private Double priceShort;

	/** 长租价格. */
	@Column(value="pricelong")
	private Double pricelong;

	/** 出租状态. */
	@Column(value="rent_type")
	private String rentType;

	/** 期数. */
	@Column(value="period")
	private Integer period;

	/** 描述. */
	@Column(value="house_describe")
	private String describe;

	/** 姓名. */
	@Column(value="house_name")
	private String name;
	
	/** 年龄. */
	@Column(value="age")
	private Integer age;
	
	/** 分类. */
	@Column(value="item")
	private String select;
	
	/** 邮箱. */
	@Column(value="email")
	private String email;

	
	
	public House() {
		super();
	}

	public House(Long id, String title, String tip, Integer tipType, Integer pics, Integer video, String buiding,
			String houseNo, String houseType, Integer layer, Double priceday, Double priceShort, Double pricelong,
			String rentType, Integer period, String describe, String name, Integer age, String select, String email) {
		super();
		this.id = id;
		this.title = title;
		this.tip = tip;
		this.tipType = tipType;
		this.pics = pics;
		this.video = video;
		this.buiding = buiding;
		this.houseNo = houseNo;
		this.houseType = houseType;
		this.layer = layer;
		this.priceday = priceday;
		this.priceShort = priceShort;
		this.pricelong = pricelong;
		this.rentType = rentType;
		this.period = period;
		this.describe = describe;
		this.name = name;
		this.age = age;
		this.select = select;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public Integer getTipType() {
		return tipType;
	}

	public void setTipType(Integer tipType) {
		this.tipType = tipType;
	}

	public Integer getPics() {
		return pics;
	}

	public void setPics(Integer pics) {
		this.pics = pics;
	}

	public Integer getVideo() {
		return video;
	}

	public void setVideo(Integer video) {
		this.video = video;
	}

	public String getBuiding() {
		return buiding;
	}

	public void setBuiding(String buiding) {
		this.buiding = buiding;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getHouseType() {
		return houseType;
	}

	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}

	public Integer getLayer() {
		return layer;
	}

	public void setLayer(Integer layer) {
		this.layer = layer;
	}

	public Double getPriceday() {
		return priceday;
	}

	public void setPriceday(Double priceday) {
		this.priceday = priceday;
	}

	public Double getPriceShort() {
		return priceShort;
	}

	public void setPriceShort(Double priceShort) {
		this.priceShort = priceShort;
	}

	public Double getPricelong() {
		return pricelong;
	}

	public void setPricelong(Double pricelong) {
		this.pricelong = pricelong;
	}

	public String getRentType() {
		return rentType;
	}

	public void setRentType(String rentType) {
		this.rentType = rentType;
	}

	public Integer getPeriod() {
		return period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSelect() {
		return select;
	}

	public void setSelect(String select) {
		this.select = select;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	 
	
}
