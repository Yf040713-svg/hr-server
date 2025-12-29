package com.yf.hr.hrserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//启动类
@MapperScan("com.yf.hr.hrserver.mapper")
@SpringBootApplication
public class HrServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrServerApplication.class, args);
    }

}
