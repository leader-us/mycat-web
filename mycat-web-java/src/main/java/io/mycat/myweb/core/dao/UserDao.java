package io.mycat.myweb.core.dao;

import java.util.Optional;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import io.mycat.myweb.core.domain.User;
/**
 * 用户（账号）Dao
 */
public interface UserDao extends PagingAndSortingRepository<User, Long> {
    @Query("SELECT * FROM account WHERE name = :name")
    Optional<User> accountByUsername(@Param("name") String name);

    @Query("SELECT * FROM account WHERE email = :email")
    Optional<User> accountByEmail(@Param("email") String email);

    @Modifying
    @Query("UPDATE account SET enabled = 1 WHERE name = :name")
    void activateAccount(@Param("name") String name);

    @Modifying
    @Query("UPDATE account SET password = :password WHERE name = :name")  
    void updatePassword(@Param("name") String name, @Param("password") String password);
}