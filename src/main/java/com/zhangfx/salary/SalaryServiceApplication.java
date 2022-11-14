package com.zhangfx.salary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author 张福兴
 * @version 1.0
 * @date 2022/11/14
 * @email zhangfuxing1010@163.com
 */
@SpringBootApplication
public class SalaryServiceApplication {

    private static final Logger log = LoggerFactory.getLogger(SalaryServiceApplication.class);
    public static void main(String[] args) {
        log.info("Starting salary service");
        SpringApplication.run(SalaryServiceApplication.class, args);
        log.info("Salary service started");
    }

}
