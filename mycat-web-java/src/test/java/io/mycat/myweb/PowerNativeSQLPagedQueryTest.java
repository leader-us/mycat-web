package io.mycat.myweb;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import io.mycat.myweb.core.DomainER.PowerDomainQuery;
import io.mycat.myweb.core.query.PowerNativeSQLPagedQuery;
import io.mycat.myweb.housesys.domain.MkBill;
import io.mycat.myweb.housesys.domain.MkContract;
import io.mycat.myweb.housesys.domain.MkUser;

public class PowerNativeSQLPagedQueryTest {

    @Test
    public void testBuildSQL() {
        String sql = "select a.*,b.title from a,b where (a.id=b.pid ) and 1=1 ";
        Map<String, Object> params = new HashMap<>();
        params.put("phone", "xxxxx");
        params.put("sex", "yyyyy");
        params.put("childId", "yyyyy");
        String result = new PowerNativeSQLPagedQuery().withSQL(sql).withConditionHandler((t) -> {
            if (t.containsKey("childId")) {
                return "and a.id in (select id from child where childId=:childId )";
            } else if (t.containsKey("phone") && t.containsKey("sex")) {
                return "and phone=:phone and sex=:sex ";
            } else if (t.containsKey("phone")) {
                return "and phone=:phone";
            }
            return "";
        }).wtihQueryParams(params).withOrderBy("order by id").withPageIndex(2).buildSQLWithPage();
        System.out.println(result);
    }

    @Test
    public void testBuildSQL2() {
        String condtion = "${AND phone like :phone }  ${OR sex= :sex} ${AND totlePrice != :totlePrice }";
        Map<String, Object> params = new HashMap<>();
        params.put("phone", "xxxxx");
        params.put("sex", "yyyyy");
        String rest = new PowerDomainQuery().withAutoRemoveDupFields(true).addDomainFieldsExclude(MkUser.class, null)
                .addDomainFieldsExclude(MkContract.class, null)
                .addDomainFieldsExclude(MkBill.class, new String[] { "id" }).withDefaultCondHandler(condtion)
                .wtihQueryParams(params).withOrderBy("order by phone asc ").buildSQLNoPage();
        // assertEquals(tokens, mytokens);
        // assertEquals(theRst, rest);
        System.out.println(rest);
    }
}