package com.guorui.test;

import com.guorui.domain.Account;
import com.guorui.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author: GuoRUi
 * @Date: 2019/8/15 下午4:26
 * @Version 1.0
 */
public class testSpring {
    @Test
    public void run() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        IAccountService as = (IAccountService) ac.getBean("accountService");

        as.saveAccount(new Account());
        List<Account> list = as.findAll();


    }
}
