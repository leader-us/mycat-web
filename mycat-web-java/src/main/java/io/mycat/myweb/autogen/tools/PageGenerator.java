package io.mycat.myweb.autogen.tools;

import java.io.IOException;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import freemarker.template.TemplateException;
import io.mycat.myweb.autogen.bean.ERRelation;
import io.mycat.myweb.autogen.service.CrudGenrator;

/**
 * 生成前端页面的命令行工具
 * 
 * @author Leader us
 */
public class PageGenerator {
    Logger log = LoggerFactory.getLogger(PageGenerator.class);

    public static void main(String[] args) {
        List<ERRelation> ers = new LinkedList<>();
        ers.add(new ERRelation("mk_contract", "user_id", "mk_user"));
        ers.add(new ERRelation("mk_bill", "user_id", "mk_user"));
        CrudGenrator gen = new CrudGenrator(
                "jdbc:mysql://localhost:3306/imkingroom?characterEncoding=UTF-8&useTimezone=true&serverTimezone=UTC",
                "root", "MyNewPass@123", "io.mycat.myweb.housesys", true, null, ers);
        try {
            gen.generator();
        } catch (ClassNotFoundException | SQLException | IOException | TemplateException e) {
            e.printStackTrace();
        }
    }
}