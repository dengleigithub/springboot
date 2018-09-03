package cn.dengl.sky.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication  /*extends SpringBootServletInitializer*/ {
//打包需要继承SpringBootServletInitializer并重写configure方法，，需要在pom.xml中把jar改成war
    /*@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        //return super.configure(builder);
        return  application.sources(SpringbootApplication.class);
    }*/

    public static void main(String[] args) {

        SpringApplication.run(SpringbootApplication.class, args);
    }
}
