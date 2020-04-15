package io.mycat.myweb.core.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 定时任务.
 * 
 */
@Table("my_task")
public class MyTask {

	@Id  
	@Column("task_id")
	/** 任务id. */
	private Long taskId;

	@Column("task_name")
	/** 任务名称. */
	private String taskName;

	@Column("responsible_user_name")
	/** 责任人姓名. */
	private String responsibleUserName;

	@Column("responsible_user_id")
	/** 责任人id. */
	private Long responsibleUserId;

	@Column("task_describe")
	/** 任务描述. */
	private String taskDescribe;

	@JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
	@Column("plan_date_start")
	/** 计划开始时间. */
	private Date planDateStart;

	@JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
	@Column("plan_date_end")
	/** 计划结束日期. */
	private Date planDateEnd ;

	@JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
	@Column("actual_date_start")
	/** 实际开始日期. */
	private Date actualDateStart;

	@JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
	@Column("actual_date_end")
	/** 实际结束日期. */
	private Date actualDateEnd;

	@Column("task_content")
	/** 任务内容. */
	private String taskContent;

	@Column("priority_level")
	/** 优先级. */
	private String priorityLevel;

	@Column("task_status")
	/** 任务状态. */
	private String taskStatus;

	@Column("task_title")
	/** 任务标题. */
	private String taskTitle;

	/**
	 * Constructor.
	 */
	public MyTask() {
	}

	/**
	 * Set the 任务id.
	 * 
	 * @param taskId
	 *            任务id
	 */
	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	/**
	 * Get the 任务id.
	 * 
	 * @return 任务id
	 */
	public Long getTaskId() {
		return this.taskId;
	}

	/**
	 * Set the 任务名称.
	 * 
	 * @param taskName
	 *            任务名称
	 */
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	/**
	 * Get the 任务名称.
	 * 
	 * @return 任务名称
	 */
	public String getTaskName() {
		return this.taskName;
	}

	/**
	 * Set the 责任人姓名.
	 * 
	 * @param responsibleUserName
	 *            责任人姓名
	 */
	public void setResponsibleUserName(String responsibleUserName) {
		this.responsibleUserName = responsibleUserName;
	}

	/**
	 * Get the 责任人姓名.
	 * 
	 * @return 责任人姓名
	 */
	public String getResponsibleUserName() {
		return this.responsibleUserName;
	}

	/**
	 * Set the 责任人id.
	 * 
	 * @param responsibleUserId
	 *            责任人id
	 */
	public void setResponsibleUserId(Long responsibleUserId) {
		this.responsibleUserId = responsibleUserId;
	}

	/**
	 * Get the 责任人id.
	 * 
	 * @return 责任人id
	 */
	public Long getResponsibleUserId() {
		return this.responsibleUserId;
	}

	/**
	 * Set the 任务描述.
	 * 
	 * @param taskDescribe
	 *            任务描述
	 */
	public void setTaskDescribe(String taskDescribe) {
		this.taskDescribe = taskDescribe;
	}

	/**
	 * Get the 任务描述.
	 * 
	 * @return 任务描述
	 */
	public String getTaskDescribe() {
		return this.taskDescribe;
	}

	/**
	 * Set the 计划开始时间.
	 * 
	 * @param planDateStart
	 *            计划开始时间
	 */
	public void setPlanDateStart(Date planDateStart) {
		this.planDateStart = planDateStart;
	}

	/**
	 * Get the 计划开始时间.
	 * 
	 * @return 计划开始时间
	 */
	public Date getPlanDateStart() {
		return this.planDateStart;
	}

	/**
	 * Set the 计划结束日期.
	 * 
	 * @param planDateEnd 
	 *            计划结束日期
	 */
	public void setPlanDateEnd (Date planDateEnd ) {
		this.planDateEnd  = planDateEnd ;
	}

	/**
	 * Get the 计划结束日期.
	 * 
	 * @return 计划结束日期
	 */
	public Date getPlanDateEnd () {
		return this.planDateEnd ;
	}

	/**
	 * Set the 实际开始日期.
	 * 
	 * @param actualDateStart
	 *            实际开始日期
	 */
	public void setActualDateStart(Date actualDateStart) {
		this.actualDateStart = actualDateStart;
	}

	/**
	 * Get the 实际开始日期.
	 * 
	 * @return 实际开始日期
	 */
	public Date getActualDateStart() {
		return this.actualDateStart;
	}

	/**
	 * Set the 实际结束日期.
	 * 
	 * @param actualDateEnd
	 *            实际结束日期
	 */
	public void setActualDateEnd(Date actualDateEnd) {
		this.actualDateEnd = actualDateEnd;
	}

	/**
	 * Get the 实际结束日期.
	 * 
	 * @return 实际结束日期
	 */
	public Date getActualDateEnd() {
		return this.actualDateEnd;
	}

	/**
	 * Set the 任务内容.
	 * 
	 * @param taskContent
	 *            任务内容
	 */
	public void setTaskContent(String taskContent) {
		this.taskContent = taskContent;
	}

	/**
	 * Get the 任务内容.
	 * 
	 * @return 任务内容
	 */
	public String getTaskContent() {
		return this.taskContent;
	}

	/**
	 * Set the 优先级.
	 * 
	 * @param priorityLevel
	 *            优先级
	 */
	public void setPriorityLevel(String priorityLevel) {
		this.priorityLevel = priorityLevel;
	}

	/**
	 * Get the 优先级.
	 * 
	 * @return 优先级
	 */
	public String getPriorityLevel() {
		return this.priorityLevel;
	}

	/**
	 * Set the 任务状态.
	 * 
	 * @param taskStatus
	 *            任务状态
	 */
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	/**
	 * Get the 任务状态.
	 * 
	 * @return 任务状态
	 */
	public String getTaskStatus() {
		return this.taskStatus;
	}

	/**
	 * Set the 任务标题.
	 * 
	 * @param taskTitle
	 *            任务标题
	 */
	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}

	/**
	 * Get the 任务标题.
	 * 
	 * @return 任务标题
	 */
	public String getTaskTitle() {
		return this.taskTitle;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((taskId == null) ? 0 : taskId.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		MyTask other = (MyTask) obj;
		if (taskId == null) {
			if (other.taskId != null) {
				return false;
			}
		} else if (!taskId.equals(other.taskId)) {
			return false;
		}
		return true;
	}

}
