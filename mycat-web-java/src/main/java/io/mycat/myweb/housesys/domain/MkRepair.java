package io.mycat.myweb.housesys.domain;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

/**
 * mk_repair
 * 
 * @author leader
 * @email leader@mycat.io
 * @date Fri Mar 27 23:53:48 CST 2020
 */

@Table("mk_repair")
public class  MkRepair {

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
	 * 合同ID
	 */
    
	@Column("contract_id")
	private Long contractId;
    /**
	 * 维修日期
	 */
    
	@Column("repair_date")
	private String repairDate;
    /**
	 * 描述
	 */
    
	@Column("remark")
	private String remark;
    /**
	 * 维修图片
	 */
    
	@Column("pics")
	private String pics;
    /**
	 * 管家ID
	 */
    
	@Column("keep_id")
	private Long keepId;
    /**
	 * 状态 1 待维修 2 维修完成 3 不需要维修
	 */
    
	@Column("state")
	private Short state;
    /**
	 * 完成日期
	 */
    
	@Column("finish")
	private java.util.Date finish;
    /**
	 * 反馈
	 */
    
	@Column("feedback")
	private String feedback;
    /**
	 * 用户ID
	 */
    
	@Column("user_id")
	private Long userId;
    /**
	 * 1、维修 2、保洁 3、退租 4、换房
	 */
    
	@Column("cfytype")
	private Short cfytype;


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
	 * 设置：合同ID
	 */
	public void setContractId(Long contractId) {
		this.contractId = contractId;
	}
	/**
	 * 获取：合同ID
	 */
    public Long isContractId() {
		return contractId;
	}
	/**
	 * 设置：维修日期
	 */
	public void setRepairDate(String repairDate) {
		this.repairDate = repairDate;
	}
	/**
	 * 获取：维修日期
	 */
    public String isRepairDate() {
		return repairDate;
	}
	/**
	 * 设置：描述
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：描述
	 */
    public String isRemark() {
		return remark;
	}
	/**
	 * 设置：维修图片
	 */
	public void setPics(String pics) {
		this.pics = pics;
	}
	/**
	 * 获取：维修图片
	 */
    public String isPics() {
		return pics;
	}
	/**
	 * 设置：管家ID
	 */
	public void setKeepId(Long keepId) {
		this.keepId = keepId;
	}
	/**
	 * 获取：管家ID
	 */
    public Long isKeepId() {
		return keepId;
	}
	/**
	 * 设置：状态 1 待维修 2 维修完成 3 不需要维修
	 */
	public void setState(Short state) {
		this.state = state;
	}
	/**
	 * 获取：状态 1 待维修 2 维修完成 3 不需要维修
	 */
    public Short isState() {
		return state;
	}
	/**
	 * 设置：完成日期
	 */
	public void setFinish(java.util.Date finish) {
		this.finish = finish;
	}
	/**
	 * 获取：完成日期
	 */
    public java.util.Date isFinish() {
		return finish;
	}
	/**
	 * 设置：反馈
	 */
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	/**
	 * 获取：反馈
	 */
    public String isFeedback() {
		return feedback;
	}
	/**
	 * 设置：用户ID
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户ID
	 */
    public Long isUserId() {
		return userId;
	}
	/**
	 * 设置：1、维修 2、保洁 3、退租 4、换房
	 */
	public void setCfytype(Short cfytype) {
		this.cfytype = cfytype;
	}
	/**
	 * 获取：1、维修 2、保洁 3、退租 4、换房
	 */
    public Short isCfytype() {
		return cfytype;
	}

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }
}