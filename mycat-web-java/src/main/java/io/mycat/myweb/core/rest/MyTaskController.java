package io.mycat.myweb.core.rest;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.json.Json;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.mycat.dao.bean.RestResult;
import io.mycat.myweb.core.domain.MyTask;
import io.mycat.myweb.core.domain.User;
import io.mycat.myweb.core.service.MyTaskService;
import io.mycat.myweb.core.service.UserService;

/**
 * 
 * 任务 rest
 *
 */
@RestController
@RequestMapping("/myTask")
public class MyTaskController {

	@Autowired
	private MyTaskService myTaskService;
	
	@Autowired
	private UserService userService;
	@PostMapping("/userlist")
	@ResponseBody
	public String userList() {
		RestResult rest = new RestResult();
		Iterable<User> findAll = userService.findAll();
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
		for (User user : findAll) {
			Map<String, Object> tmpMap = setConditionMap(user);
			data.add(tmpMap);
		}
		// 未处理数据操作异常
		rest.retCode = 0;
		rest.data = Json.createArrayBuilder(data).build();
		return rest.toJSonString();
	}
	
	@PostMapping("/query")
	@ResponseBody
	public String query(@RequestBody MyTask myTask) {
		RestResult rest = new RestResult();
		// 未处理数据操作异常
		List<MyTask> myTaskByStatusAndUserAndTitle = myTaskService.myTaskByStatusAndUserAndTitle(myTask.getTaskStatus(),myTask.getResponsibleUserId(),myTask.getTaskTitle());
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
		for (MyTask t : myTaskByStatusAndUserAndTitle) {
			Map<String, Object> tmpMap = setConditionMap(t);
			data.add(tmpMap);
		}
		rest.retCode = 0;
		rest.data = Json.createArrayBuilder(data).build();
		return rest.toJSonString();
	}

	@PostMapping("/delete")
	@ResponseBody
	public String delete(@RequestBody Long id) {
		// 未进行非空判断
		RestResult rest = new RestResult();
		// 未处理数据操作异常
		myTaskService.deleteById(id);
		rest.retCode = 0;
		rest.data = Json.createValue("删除成功");
		return rest.toJSonString();
	}

	@PostMapping("/selectbyid")
	@ResponseBody
	public String selectbyid(@RequestBody Long id) {
		// 未进行非空判断
		RestResult rest = new RestResult();
		// 未处理数据操作异常
		MyTask findById = myTaskService.findById(id).orElse(null);
		if (findById == null) {
			rest.data = Json.createValue("查询数据不存在");
			rest.retCode = 410;
			return rest.toJSonString();
		}

		Map<String, Object> data = setConditionMap(findById);
		rest.retCode = 0;
		rest.data = Json.createObjectBuilder(data).build();
		return rest.toJSonString();
	}

	@PostMapping("/create")
	@ResponseBody
	public String create(@RequestBody MyTask myTask) {
		// 未进行非空判断
		RestResult rest = new RestResult();
		// 未处理数据操作异常
		myTaskService.save(myTask);
		rest.retCode = 0;
		rest.data = Json.createValue("保存成功");
		return rest.toJSonString();
	}

	
	@PostMapping("/update")
	@ResponseBody
	public String updadte(@RequestBody MyTask myTask) {
		// 未进行非空判断
		Long id = myTask.getTaskId();
		RestResult rest = new RestResult();
		// 未处理数据操作异常
		MyTask findById = myTaskService.findById(id).orElse(null);
		if (findById == null) {
			rest.data = Json.createValue("查询数据不存在");
			rest.retCode = 410;
			return rest.toJSonString();
		}

 		myTaskService.update(myTask);
		
		rest.retCode = 0;
		rest.data = Json.createValue("更新成功");
		return rest.toJSonString();
	}

	// 此行一下为临时操作工具

	/**
	 * 将一个类查询方式加入map（属性值为int型时，0时不加入， 属性值为String型或Long时为null和“”不加入）
	 *
	 */
	private Map<String, Object> setConditionMap(Object obj) {
		Map<String, Object> map = new HashMap<String, Object>();
		if (obj == null) {
			return null;
		}
		Field[] fields = obj.getClass().getDeclaredFields();
		for (Field field : fields) {
			String fieldName = field.getName();
			Class<?> type = field.getType();
			Object valueByFieldName = getValueByFieldName(fieldName, obj);
			if (Date.class==type) {
				valueByFieldName = new SimpleDateFormat("yyyy-MM-dd").format(valueByFieldName);
			}
			if (valueByFieldName != null)
				map.put(fieldName, valueByFieldName);
		}

		return map;

	}

	/**
	 * 根据属性名获取该类此属性的值
	 * 
	 * @param fieldName
	 * @param object
	 * @return
	 */
	private Object getValueByFieldName(String fieldName, Object object) {
		String firstLetter = fieldName.substring(0, 1).toUpperCase();
		String getter = "get" + firstLetter + fieldName.substring(1);
		try {
			Method method = object.getClass().getMethod(getter, new Class[] {});
			Object value = method.invoke(object, new Object[] {});
			return value;
		} catch (Exception e) {
			return null;
		}

	}
}
