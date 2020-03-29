package io.mycat.myweb.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.mycat.myweb.core.dao.AccountDao;

@RestController
public class HelloController {

    @Autowired
    AccountDao accountresp;
    @RequestMapping(value="/hello",method= RequestMethod.GET)
    public String sayHello(){
        
        return "hello ,count is "+accountresp.count();
    }
}