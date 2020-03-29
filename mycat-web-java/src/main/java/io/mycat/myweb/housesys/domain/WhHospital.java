package io.mycat.myweb.housesys.domain;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

/**
 * wh_hospital
 * 
 * @author leader
 * @email leader@mycat.io
 * @date Fri Mar 27 23:53:48 CST 2020
 */

@Table("wh_hospital")
public class  WhHospital {

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
	 * 医院名称
	 */
    
	@Column("hospital_name")
	private String hospitalName;
    /**
	 * 区域
	 */
    
	@Column("region_id")
	private Integer regionId;


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
	 * 设置：医院名称
	 */
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	/**
	 * 获取：医院名称
	 */
    public String isHospitalName() {
		return hospitalName;
	}
	/**
	 * 设置：区域
	 */
	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}
	/**
	 * 获取：区域
	 */
    public Integer isRegionId() {
		return regionId;
	}

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }
}