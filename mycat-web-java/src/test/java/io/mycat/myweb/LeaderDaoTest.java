package io.mycat.myweb;

import java.sql.SQLException;

import javax.json.JsonArray;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.mycat.myweb.core.DomainER.PowerDomainQuery;
import io.mycat.myweb.core.dao.LeaderDao;
import io.mycat.myweb.core.query.PagedQuery;
import io.mycat.myweb.housesys.domain.MkBill;
import io.mycat.myweb.housesys.domain.MkContract;
import io.mycat.myweb.housesys.domain.MkUser;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LeaderDaoTest {
    Logger log = LoggerFactory.getLogger(LeaderDaoTest.class);
    @Autowired
    private LeaderDao leaderDAO;

    @Test
    public void testPagedQuery() throws SQLException {
        PagedQuery qry = new PowerDomainQuery().withAutoRemoveDupFields(true).addDomainFieldsExclude(MkUser.class, null)
                .addDomainFieldsExclude(MkContract.class, null)
                .addDomainFieldsExclude(MkBill.class, new String[] { "id" })
                .withDefaultCondHandler("${and phone like :phone} ").addQueryParam("phone", "139%")
                .withOrderBy("order by phone asc ").withPageIndex(0);
        JsonArray jsonRest = leaderDAO.exePagedQuery(qry);
        System.out.println(jsonRest.toString());
        // Pageable pageable = PageRequest.of(0, 3, Sort.by("id").descending());
        // Page<MkUser> result=userRep.findAll(pageable);
        // System.out.println("total result :"+result.getNumber());
    }

    @Test
    public void testQueryCount() throws SQLException {
        PagedQuery qry = new PowerDomainQuery().withAutoRemoveDupFields(true).addDomainFieldsExclude(MkUser.class, null)
                .addDomainFieldsExclude(MkContract.class, null)
                .addDomainFieldsExclude(MkBill.class, new String[] { "id" })
                .withDefaultCondHandler("${and phone like :phone} ").addQueryParam("phone", "139%")
                .withOrderBy("order by phone asc ").withPageIndex(0);
        long result = leaderDAO.exeQueryCount(qry);
        System.out.println("total " + result);
        // Pageable pageable = PageRequest.of(0, 3, Sort.by("id").descending());
        // Page<MkUser> result=userRep.findAll(pageable);
        // System.out.println("total result :"+result.getNumber());
    }
}