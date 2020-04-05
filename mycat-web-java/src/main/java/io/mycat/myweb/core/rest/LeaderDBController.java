package io.mycat.myweb.core.rest;

import java.util.Map;

import javax.json.JsonValue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.mycat.dao.LeaderDao;
import io.mycat.dao.bean.PageResultSet;

/**
 * 通用的分页查询Rest接口
 * 
 * @author Leader us
 */
@RestController
public class LeaderDBController {

    @Autowired
    LeaderDao leaderDAO;

    @GetMapping(value = "/core/dbcontroller/{queryname}", produces = "application/json")
    public String GeneralPageQuery(@PathVariable("queryname") String queryName,
            @RequestParam Map<String, Object> params) {
        PageResultSet result = new PageResultSet();
        JsonValue jsonRest = null;
        // TODO load query from queryName
        // int pageSize = ParamUtil.getPageSize(params);
        // int pageIndex = ParamUtil.getPageIndex(params);
        // try {
        //     PagedQuery qry = new PowerDomainQuery().withAutoRemoveDupFields(true)
        //             .addDomainFieldsExclude(MkUser.class, null).addDomainFieldsExclude(MkContract.class, null)
        //             .addDomainFieldsExclude(MkBill.class, new String[] { "id" })
        //             .withDefaultCondHandler("${and phone like :phone} ${and sex like :sex} ").wtihQueryParams(params)
        //             .withOrderBy("order by phone asc ").withPageIndex(pageIndex).withPageSize(pageSize);
        //     jsonRest = leaderDAO.exePagedQuery(qry);
        // } catch (Exception e) {
        //     result.retCode = -1;
        //     jsonRest = Json.createValue("error:" + e.toString());
        // }
        result.data = jsonRest;
        return result.toJSonString();
    }
}