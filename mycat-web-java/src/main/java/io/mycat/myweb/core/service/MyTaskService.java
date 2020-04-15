package io.mycat.myweb.core.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.mycat.myweb.core.dao.MyTaskDao;
import io.mycat.myweb.core.domain.MyTask;

/**
 * 
 * 任务客房 service
 *
 */
@Service
public class MyTaskService {

	@Autowired
	private MyTaskDao myTaskDao;

	public List<MyTask> myTaskByStatusAndUserAndTitle(String taskStatus, Long responsibleUserId, String taskTitle) {
		return myTaskDao.myTaskByStatusAndUserAndTitle( taskStatus,  responsibleUserId,  taskTitle);
	}
	
	public void deleteById(Long id) {
		myTaskDao.deleteById(id);
		
	}
	
	public Optional<MyTask> findById(Long id) {
		 
		return myTaskDao.findById(id);
	}

	public MyTask save(MyTask myTask) {
		return myTaskDao.save(myTask);
	}
	
	public void update(MyTask myTask) {
		 myTaskDao.update(myTask.getTaskId(),myTask.getTaskName(),myTask.getResponsibleUserId(),myTask.getTaskDescribe(),myTask.getPlanDateStart(),myTask.getActualDateEnd(),myTask.getActualDateStart(),myTask.getActualDateEnd(),myTask.getTaskContent(),myTask.getPriorityLevel(),myTask.getTaskStatus(),myTask.getTaskTitle());
	}
	
}
