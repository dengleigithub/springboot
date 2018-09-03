package cn.dengl.sky.springboot.dao;

import cn.dengl.sky.springboot.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface AccountMapper {
    public List<Account> selectUserByName(String name);
    public void deleteAccount(int id);
    public void updateAccount(Account account);
    public void addAccount(Account account);
}
