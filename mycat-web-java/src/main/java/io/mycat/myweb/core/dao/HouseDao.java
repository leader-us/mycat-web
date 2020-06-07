package io.mycat.myweb.core.dao;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import io.mycat.myweb.core.domain.House;

/**
 * 客房 Dao
 */
public interface HouseDao extends PagingAndSortingRepository<House, Long> {

	@Query(value = "SELECT  * FROM house WHERE "
			+ "IF(ifnull(:name,'') != '',house_name =:name,1=1)"
			+ "AND IF(ifnull(:age,'') != '',age =:age,1=1)"
			+ "AND IF(ifnull(:select,'') != '',item =:select,1=1)")
	List<House> houseByNameAndAgeAndItem(@Param("name") String name, @Param("age") Integer age,
			@Param("select") String select);

	@Modifying
	@Query("UPDATE house SET house_name = :name , email = :email , item = :item WHERE id = :id")
	void update(@Param("id") Long id, @Param("name") String name, @Param("email") String email,
			@Param("item") String item);
}
