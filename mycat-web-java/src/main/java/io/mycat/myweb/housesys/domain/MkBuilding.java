package io.mycat.myweb.housesys.domain;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

/**
 * mk_building
 * 
 * @author leader
 * @email leader@mycat.io
 * @date Fri Mar 27 23:53:48 CST 2020
 */

@Table("mk_building")
public class  MkBuilding {

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
	 * 大楼名称
	 */
    
	@Column("title")
	private String title;
    /**
	 * 大楼地址
	 */
    
	@Column("address")
	private String address;
    /**
	 * 详情描述
	 */
    
	@Column("content")
	private String content;
    /**
	 * 状态 1启用 0禁用
	 */
    
	@Column("state")
	private Short state;
    /**
	 * 坐标
	 */
    
	@Column("coordinate")
	private String coordinate;
    /**
	 * 附近
	 */
    
	@Column("nearby")
	private String nearby;


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
	 * 设置：大楼名称
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：大楼名称
	 */
    public String isTitle() {
		return title;
	}
	/**
	 * 设置：大楼地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：大楼地址
	 */
    public String isAddress() {
		return address;
	}
	/**
	 * 设置：详情描述
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：详情描述
	 */
    public String isContent() {
		return content;
	}
	/**
	 * 设置：状态 1启用 0禁用
	 */
	public void setState(Short state) {
		this.state = state;
	}
	/**
	 * 获取：状态 1启用 0禁用
	 */
    public Short isState() {
		return state;
	}
	/**
	 * 设置：坐标
	 */
	public void setCoordinate(String coordinate) {
		this.coordinate = coordinate;
	}
	/**
	 * 获取：坐标
	 */
    public String isCoordinate() {
		return coordinate;
	}
	/**
	 * 设置：附近
	 */
	public void setNearby(String nearby) {
		this.nearby = nearby;
	}
	/**
	 * 获取：附近
	 */
    public String isNearby() {
		return nearby;
	}

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }
}