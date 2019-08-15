package com.guorui.service;

import com.guorui.domain.Account;

import java.util.List;

/**
 * @Author: GuoRUi
 * @Date: 2019/8/15 下午4:13
 * @Version 1.0
 */
public interface IAccountService {
    /**
     * 查询所有
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存账户信息
     * @param account
     */
    public void saveAccount(Account account);
}
