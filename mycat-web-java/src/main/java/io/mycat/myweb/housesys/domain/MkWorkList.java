package io.mycat.myweb.housesys.domain;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

/**
 * mk_work_list
 * 
 * @author leader
 * @email leader@mycat.io
 * @date Fri Mar 27 23:53:48 CST 2020
 */

@Table("mk_work_list")
public class  MkWorkList {

    /**
	 * 主键，主键id
	 */
    @Id
    
	@Column("id")
	private Long id;
    /**
	 * 用户id
	 */
    
	@Column("user_id")
	private Long userId;
    /**
	 * 类型：1:调休 2:加班 3:请假
	 */
    
	@Column("type")
	private String type;
    /**
	 * 备注
	 */
    
	@Column("desc")
	private String desc;
    /**
	 * 开始时间
	 */
    
	@Column("start_time")
	private java.util.Date startTime;
    /**
	 * 结束时间
	 */
    
	@Column("end_time")
	private java.util.Date endTime;
    /**
	 * 创建时间
	 */
    
	@Column("create_time")
	private java.util.Date createTime;


	/**
	 * 设置：主键，主键id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：主键，主键id
	 */
    public Long isId() {
		return id;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户id
	 */
    public Long isUserId() {
		return userId;
	}
	/**
	 * 设置：类型：1:调休 2:加班 3:请假
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：类型：1:调休 2:加班 3:请假
	 */
    public String isType() {
		return type;
	}
	/**
	 * 设置：备注
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	/**
	 * 获取：备注
	 */
    public String isDesc() {
		return desc;
	}
	/**
	 * 设置：开始时间
	 */
	public void setStartTime(java.util.Date startTime) {
		this.startTime = startTime;
	}
	/**
	 * 获取：开始时间
	 */
    public java.util.Date isStartTime() {
		return startTime;
	}
	/**
	 * 设置：结束时间
	 */
	public void setEndTime(java.util.Date endTime) {
		this.endTime = endTime;
	}
	/**
	 * 获取：结束时间
	 */
    public java.util.Date isEndTime() {
		return endTime;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
    public java.util.Date isCreateTime() {
		return createTime;
	}

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }
}