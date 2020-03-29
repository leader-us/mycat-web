package io.mycat.myweb.housesys.domain;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

/**
 * mk_attach
 * 
 * @author leader
 * @email leader@mycat.io
 * @date Fri Mar 27 23:53:48 CST 2020
 */

@Table("mk_attach")
public class  MkAttach {

    /**
	 * 主键，id主键
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
	 * 文件名
	 */
    
	@Column("file_name")
	private String fileName;
    /**
	 * 文件扩展名
	 */
    
	@Column("file_type")
	private String fileType;
    /**
	 * 文件保存路径
	 */
    
	@Column("path")
	private String path;
    /**
	 * 文件大小
	 */
    
	@Column("size")
	private Long size;
    /**
	 * 700*300
	 */
    
	@Column("path1")
	private String path1;
    /**
	 * 150*150
	 */
    
	@Column("path2")
	private String path2;


	/**
	 * 设置：主键，id主键
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：主键，id主键
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
	 * 设置：文件名
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	/**
	 * 获取：文件名
	 */
    public String isFileName() {
		return fileName;
	}
	/**
	 * 设置：文件扩展名
	 */
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	/**
	 * 获取：文件扩展名
	 */
    public String isFileType() {
		return fileType;
	}
	/**
	 * 设置：文件保存路径
	 */
	public void setPath(String path) {
		this.path = path;
	}
	/**
	 * 获取：文件保存路径
	 */
    public String isPath() {
		return path;
	}
	/**
	 * 设置：文件大小
	 */
	public void setSize(Long size) {
		this.size = size;
	}
	/**
	 * 获取：文件大小
	 */
    public Long isSize() {
		return size;
	}
	/**
	 * 设置：700*300
	 */
	public void setPath1(String path1) {
		this.path1 = path1;
	}
	/**
	 * 获取：700*300
	 */
    public String isPath1() {
		return path1;
	}
	/**
	 * 设置：150*150
	 */
	public void setPath2(String path2) {
		this.path2 = path2;
	}
	/**
	 * 获取：150*150
	 */
    public String isPath2() {
		return path2;
	}

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }
}