package com.liyanxing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.liyanxing.users.*.mapper")
public class MyWebApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(MyWebApplication.class, args);
    }
}