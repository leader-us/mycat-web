package io.mycat.myweb.core.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import io.mycat.myweb.core.domain.MyTask;

/**
 * 任务 Dao
 */
public interface MyTaskDao extends PagingAndSortingRepository<MyTask, Long> {

	@Query(value = "SELECT  * FROM my_task WHERE "
			+ "IF(ifnull(:taskStatus,'') != '',task_status =:taskStatus,1=1)"
			+ "AND IF(ifnull(:responsibleUserId,'') != '',responsible_user_id =:responsibleUserId,1=1)"
			+ "AND IF(ifnull(:taskTitle,'') != '',task_title like CONCAT('%',:taskTitle,'%'),1=1)")
	List<MyTask> myTaskByStatusAndUserAndTitle(String taskStatus, Long responsibleUserId, String taskTitle);

	@Modifying
	@Query("UPDATE my_task   SET task_name = :taskName,"
			+ " responsible_user_id = :responsibleUserId, "
			+ " task_describe = :taskDescribe, "
			+ " plan_date_start = :planDateStart,"
			+ " plan_date_end = :planDateEnd,"
			+ " actual_date_start = :actualDateStart, "
			+ " actual_date_end = :actualDateEnd, "
			+ " task_content = :taskContent,"
			+ " priority_level = :priorityLevel, "
			+ " task_status = :taskStatus, "
			+ " task_title = :taskTitle "
			+ "WHERE task_id = :taskId")
	void update(@Param("taskId") Long taskId,
			@Param("taskName") String taskName,
			@Param("responsibleUserId") Long responsibleUserId,
			@Param("taskDescribe") String taskDescribe,
			@Param("planDateStart") Date planDateStart,
			@Param("planDateEnd") Date planDateEnd,
			@Param("actualDateStart") Date actualDateStart,
			@Param("actualDateEnd") Date actualDateEnd,
			@Param("taskContent") String taskContent,
			@Param("priorityLevel") String priorityLevel,
			@Param("taskStatus") String taskStatus,
			@Param("taskTitle") String taskTitle
			);

//	void update(Long taskId, String taskName, String responsibleUserName, String taskDescribe, Date planDateStart,
//			Date actualDateEnd, Date planDateEnd, Date actualDateStart, Date actualDateEnd2, String taskContent,
//			String priorityLevel, String taskStatus, String taskTitle);
	
}
