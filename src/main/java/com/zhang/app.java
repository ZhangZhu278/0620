package com.zhang;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
@MapperScan("com.zhang.mapper")
public class app {
    public static void main(String[] args) {
        SpringApplication.run(app.class, args);
        log.info("项目启动成功！");
    }
}
