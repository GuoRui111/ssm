package com.guorui.controller;

import com.guorui.domain.Account;
import com.guorui.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 账户控制器
 * @Author: GuoRUi
 * @Date: 2019/8/15 下午4:14
 * @Version 1.0
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层查询所有账户信息！");

        List<Account> list = accountService.findAll();

        model.addAttribute("list", list);

        return "list";
    }

    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println("表现层保存账户信息！");

        accountService.saveAccount(account);

        return "save";
    }
}
