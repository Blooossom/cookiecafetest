package com.example.cookiecafetest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(value={"com.example.cookiecafetest.mapper"})
public class CookieCafeTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CookieCafeTestApplication.class, args);
    }

}
