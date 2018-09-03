package cn.dengl.sky.springboot.service.IService;

import cn.dengl.sky.springboot.entity.Account;

import java.util.List;

public interface AccountIService {
    public void insert(Account account);
    public void delete(int id);
    public void update(Account account);
    public List<Account> find(String loginName);
}
