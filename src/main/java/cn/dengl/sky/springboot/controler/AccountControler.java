package cn.dengl.sky.springboot.controler;

import cn.dengl.sky.springboot.entity.Account;
import cn.dengl.sky.springboot.service.AccountService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ComponentScan({"cn.dengl.sky.springboot.service"})
@MapperScan({"cn.dengl.sky.springboot.dao"})
public class AccountControler {
    public  static final Logger log=LogManager.getLogger(Account.class);
    @Autowired
    private AccountService accountService;
    @RequestMapping("/byname")
    public List<Account> getAccount(String name){
        log.info(accountService.find(name));
        return accountService.find(name);
    }
    @RequestMapping("/add")
    public void add(Account account){
        accountService.insert(account);
    }
    @RequestMapping("/delete")
    public void delete(Integer id){
        accountService.delete(id);
    }
    @RequestMapping("/update")
    public void update(Account account){
        accountService.update(account);
    }

}
