package io.mycat.myweb.housesys.domain;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

/**
 * mk_service
 * 
 * @author leader
 * @email leader@mycat.io
 * @date Fri Mar 27 23:53:48 CST 2020
 */

@Table("mk_service")
public class  MkService {

    /**
	 * 主键，
	 */
    @Id
    
	@Column("id")
	private Long id;
    /**
	 * 服务名称
	 */
    
	@Column("service_name")
	private String serviceName;
    /**
	 * 价格
	 */
    
	@Column("price")
	private String price;
    /**
	 * 描述
	 */
    
	@Column("remark")
	private String remark;
    /**
	 * 创建日期
	 */
    
	@Column("create_date")
	private java.util.Date createDate;


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
	 * 设置：服务名称
	 */
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	/**
	 * 获取：服务名称
	 */
    public String isServiceName() {
		return serviceName;
	}
	/**
	 * 设置：价格
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	/**
	 * 获取：价格
	 */
    public String isPrice() {
		return price;
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

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }
}