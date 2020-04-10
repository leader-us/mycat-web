package io.mycat.myweb.core.rest;

import java.io.StringReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.mycat.dao.bean.RestResult;
import io.mycat.myweb.core.domain.House;
import io.mycat.myweb.core.service.HouseService;

/**
 * 
 * 客房 rest
 *
 */
@RestController
@RequestMapping("/house")
public class HouseController {

	@Autowired
	private HouseService houseService;

	@PostMapping("/query")
	@ResponseBody
	public String query(@RequestBody House house) {
		RestResult rest = new RestResult();
		// 未处理数据操作异常
		List<House> houseByNameAndAgeAndItem = houseService.houseByNameAndAgeAndItem(house.getName(), house.getAge(),
				house.getSelect());
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
		for (House h : houseByNameAndAgeAndItem) {
			Map<String, Object> tmpMap = setConditionMap(h);
			data.add(tmpMap);
		}
		rest.retCode = 0;
		rest.data = Json.createArrayBuilder(data).build();
		return rest.toJSonString();
	}

	@PostMapping("/delete")
	@ResponseBody
	public String delete(@RequestBody House house) {
		// 未进行非空判断
		Long id = house.getId();
		RestResult rest = new RestResult();
		// 未处理数据操作异常
		houseService.deleteById(id);
		rest.retCode = 0;
		rest.data = Json.createValue("删除成功");
		return rest.toJSonString();
	}

	@PostMapping("/selectbyid")
	@ResponseBody
	public String selectbyid(@RequestBody House house) {
		// 未进行非空判断
		Long id = house.getId();
		RestResult rest = new RestResult();
		// 未处理数据操作异常
		House findById = houseService.findById(id).orElse(null);
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

	@PostMapping("/update")
	@ResponseBody
	public String updadte(@RequestBody House house) {
		// 未进行非空判断
		Long id = house.getId();
		RestResult rest = new RestResult();
		// 未处理数据操作异常
		House findById = houseService.findById(id).orElse(null);
		if (findById == null) {
			rest.data = Json.createValue("查询数据不存在");
			rest.retCode = 410;
			return rest.toJSonString();
		}

		houseService.update(id, house.getName(), house.getEmail(), house.getSelect());
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
			if (getValueByFieldName(fieldName, obj) != null)
				map.put(fieldName, getValueByFieldName(fieldName, obj));
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
