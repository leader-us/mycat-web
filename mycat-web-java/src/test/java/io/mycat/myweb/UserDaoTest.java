package io.mycat.myweb;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import io.mycat.myweb.core.dao.UserDao;
import io.mycat.myweb.core.domain.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {
    Logger log = LoggerFactory.getLogger(UserDaoTest.class);
    @Autowired
    private UserDao userDao;

    @Test
    public void testSelectUser() {
        userDao.findById((long) 1);
        System.out.println("find by id ok .............");
        for (User user : userDao.findAll()) {
            log.info("user " + user);
        }
        Pageable pageable = PageRequest.of(0, 3, Sort.by("id").descending());
        Page<User> result = userDao.findAll(pageable);
        System.out.println("total result :" + result.getTotalElements());
    }

}