package ${package}.domain;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

/**
 * ${comments}
 * 
 * @author ${author}
 * @email ${email}
 * @date ${datetime}
 */

@Table("${tableName}")
public class  ${className} {

    <#list columns as column >
    /**
	 * ${column.comments}
	 */
	<#if (column.columnName == pk.columnName)>
    @Id
	</#if>
	<#if (column.er)??>
	@io.mycat.myweb.core.DomainER.ForeginKey(${column.er.parentDomain}.class)
	<#else>
    
	</#if>
	@Column("${column.columnName}")
	private ${column.attrType} ${column.attrname};
    </#list>


    <#list columns as column>
	/**
	 * 设置：${column.comments}
	 */
	public void set${column.attrName}(${column.attrType} ${column.attrname}) {
		this.${column.attrname} = ${column.attrname};
	}
	/**
	 * 获取：${column.comments}
	 */
	 <#if (column.attrType == 'Boolean')>
	public ${column.attrType} get${column.attrName}() {
	<#else>
    public ${column.attrType} is${column.attrName}() {
	</#if>	
		return ${column.attrname};
	}
    </#list>

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }
}