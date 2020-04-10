package io.mycat.myweb.core.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.mycat.myweb.core.dao.HouseDao;
import io.mycat.myweb.core.domain.House;

/**
 * 
 * 客房 service
 *
 */
@Service
public class HouseService {

	@Autowired
	private HouseDao houseDao;
	
	public  List<House> houseByNameAndAgeAndItem(String name,Integer age,String item){
		return houseDao.houseByNameAndAgeAndItem(name, age, item);
	}
	public void update(Long id, String name,String email, String item) {
		houseDao.update(id, name, email, item);
	}
	public void deleteById(Long id) {
		houseDao.deleteById(id);
		
	}
	public Optional<House> findById(Long id) {
		 
		return houseDao.findById(id);
	}
}
