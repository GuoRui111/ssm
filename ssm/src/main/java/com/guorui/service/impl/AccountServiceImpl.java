package com.guorui.service.impl;

import com.guorui.dao.IAccountDao;
import com.guorui.domain.Account;
import com.guorui.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: GuoRUi
 * @Date: 2019/8/15 下午4:13
 * @Version 1.0
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);

    }
}
