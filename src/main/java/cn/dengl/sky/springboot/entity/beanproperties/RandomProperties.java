package cn.dengl.sky.springboot.entity.beanproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.Serializable;
@Configuration
/*@ConfigurationProperties(prefix ="com.waiting.random")*/
@ConfigurationProperties(prefix = "com.waiting.random")
@PropertySource("classpath:waiting/random.properties")
public class RandomProperties {
    private String str;
    private Integer number;
    private Long bigNumber;
    private Integer test1;
    private Integer test2;

    public String getStr() {
        return str;
    }

    public RandomProperties() {
    }

    public Integer getNumber() {
        return number;
    }

    public Long getBigNumber() {
        return bigNumber;
    }

    public Integer getTest1() {
        return test1;
    }

    public Integer getTest2() {
        return test2;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setBigNumber(Long bigNumber) {
        this.bigNumber = bigNumber;
    }

    public void setTest1(Integer test1) {
        this.test1 = test1;
    }

    public void setTest2(Integer test2) {
        this.test2 = test2;
    }

    @Override
    public String toString() {
        return "RandomProperties{" +
                "str='" + str + '\'' +
                ", number=" + number +
                ", bigNumber=" + bigNumber +
                ", test1=" + test1 +
                ", test2=" + test2 +
                '}';
    }
}
