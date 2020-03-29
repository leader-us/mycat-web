package io.mycat.myweb.housesys.domain;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

/**
 * wh_hotel_hospital
 * 
 * @author leader
 * @email leader@mycat.io
 * @date Fri Mar 27 23:53:48 CST 2020
 */

@Table("wh_hotel_hospital")
public class  WhHotelHospital {

    /**
	 * 主键，
	 */
    @Id
    
	@Column("id")
	private Long id;
    /**
	 * 酒店
	 */
    
	@Column("hotel_id")
	private Long hotelId;
    /**
	 * 医院
	 */
    
	@Column("hospital_id")
	private Long hospitalId;
    /**
	 * 距离
	 */
    
	@Column("distance")
	private Integer distance;
    /**
	 * 注释
	 */
    
	@Column("hospital_name")
	private String hospitalName;
    /**
	 * 类名
	 */
    
	@Column("hospital_addr")
	private String hospitalAddr;


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
	 * 设置：酒店
	 */
	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}
	/**
	 * 获取：酒店
	 */
    public Long isHotelId() {
		return hotelId;
	}
	/**
	 * 设置：医院
	 */
	public void setHospitalId(Long hospitalId) {
		this.hospitalId = hospitalId;
	}
	/**
	 * 获取：医院
	 */
    public Long isHospitalId() {
		return hospitalId;
	}
	/**
	 * 设置：距离
	 */
	public void setDistance(Integer distance) {
		this.distance = distance;
	}
	/**
	 * 获取：距离
	 */
    public Integer isDistance() {
		return distance;
	}
	/**
	 * 设置：注释
	 */
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	/**
	 * 获取：注释
	 */
    public String isHospitalName() {
		return hospitalName;
	}
	/**
	 * 设置：类名
	 */
	public void setHospitalAddr(String hospitalAddr) {
		this.hospitalAddr = hospitalAddr;
	}
	/**
	 * 获取：类名
	 */
    public String isHospitalAddr() {
		return hospitalAddr;
	}

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }
}