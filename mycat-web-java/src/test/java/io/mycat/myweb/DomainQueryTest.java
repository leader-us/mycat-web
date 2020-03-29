package io.mycat.myweb;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import io.mycat.myweb.core.DomainER.PowerDomainQuery;
import io.mycat.myweb.housesys.domain.MkBill;
import io.mycat.myweb.housesys.domain.MkContract;
import io.mycat.myweb.housesys.domain.MkUser;

public class DomainQueryTest {

    @Test
    public void buildSQL() {
        String condtion = "${AND phone like :phone }  ${OR sex= :sex} ${AND totlePrice != :totlePrice }";
        Map<String, Object> params = new HashMap<>();
        params.put("phone", "xxxxx");
        params.put("sex", "yyyyy");
        params.put("totlePrice", "yyyyy");
        String rest = new PowerDomainQuery().withAutoRemoveDupFields(true).addDomainFieldsExclude(MkUser.class, null)
                .addDomainFieldsExclude(MkContract.class, null)
                .addDomainFieldsExclude(MkBill.class, new String[] { "id" }).withDefaultCondHandler(condtion)
                .wtihQueryParams(params).withOrderBy("order by phone asc ").buildSQLWithPage();
        // assertEquals(tokens, mytokens);
        // assertEquals(theRst, rest);
        System.out.println(rest);
    }

    @Test
    public void buildSQL2() {
        String condtion = "${AND phone like :phone }  ${OR sex= :sex} ${AND totlePrice != :totlePrice }";
        Map<String, Object> params = new HashMap<>();
        params.put("phone", "xxxxx");
        params.put("sex", "yyyyy");
        String rest = new PowerDomainQuery().withAutoRemoveDupFields(true).addDomainFieldsExclude(MkUser.class, null)
                .addDomainFieldsExclude(MkContract.class, null)
                .addDomainFieldsExclude(MkBill.class, new String[] { "id" }).withDefaultCondHandler(condtion)
                .wtihQueryParams(params).withOrderBy("order by phone asc ").buildSQLWithPage();
        // assertEquals(tokens, mytokens);
        // assertEquals(theRst, rest);
        System.out.println(rest);
    }
}