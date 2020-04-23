package com.zyd.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class BlogAdminUserCenterApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogAdminUserCenterApiApplication.class, args);
    }
}
