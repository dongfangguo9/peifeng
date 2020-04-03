package com.gxpeifeng.peifeng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.gxpeifeng.peifeng.dao")
@SpringBootApplication
public class PeifengApplication {

    public static void main(String[] args) {
        SpringApplication.run(PeifengApplication.class, args);
    }

}
