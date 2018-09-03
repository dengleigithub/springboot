package cn.dengl.sky.springboot.service;

import cn.dengl.sky.springboot.dao.AccountMapper;
import cn.dengl.sky.springboot.entity.Account;
import cn.dengl.sky.springboot.service.IService.AccountIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;

@ComponentScan({"cn.dengl.sky.springboot.dao"})
@Service("accountService")
public class AccountService implements AccountIService {
    @Autowired
    private AccountMapper accountMapper;
    @Override
    public void insert(Account account) {
        accountMapper.addAccount(account);
    }

    @Override
    public void delete(int id) {
        accountMapper.deleteAccount(id);

    }

    @Override
    public void update(Account account) {
        accountMapper.updateAccount(account);
    }
    @Override
    public List<Account> find(String loginName) {
        return accountMapper.selectUserByName(loginName);
    }
}
