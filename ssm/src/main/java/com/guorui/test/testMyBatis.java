package com.guorui.test;

import com.guorui.dao.IAccountDao;
import com.guorui.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author: GuoRUi
 * @Date: 2019/8/15 下午6:04
 * @Version 1.0
 */
public class testMyBatis {
    @Test
    public void run1(){
//        try {
//            InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
//            SqlSession sqlSession = new SqlSessionFactoryBuilder().build(in).openSession();
//
//            IAccountDao accountDao = sqlSession.getMapper(IAccountDao.class);
//
//
//            Account account = new Account();
//
//            account.setName("琉璃");
//            account.setMoney(1000.10);
//
//            accountDao.saveAccount(account);
//            List<Account> list = accountDao.findAll();
//
//            for (Account account1 : list) {
//                System.out.println(account1);
//            }
//
//            sqlSession.close();
//            in.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
