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

import io.mycat.myweb.housesys.dao.MkUserDao;
import io.mycat.myweb.housesys.domain.MkUser;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyAppTests {
    Logger log = LoggerFactory.getLogger(MyAppTests.class);
    @Autowired
    private MkUserDao userRep;

    @Test
    public void testSave() {
        userRep.findById((long) 1);
        System.out.println("find by id ok .............");
        for (MkUser user : userRep.findAll()) {
            log.info("user " + user);
        }
        Pageable pageable = PageRequest.of(0, 3, Sort.by("id").descending());
        Page<MkUser> result = userRep.findAll(pageable);
        System.out.println("total result :" + result.getTotalElements());
    }

   
}