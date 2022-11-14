package com.zhangfx.salary.controller;

import com.zhangfx.salary.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *
 * @author 张福兴
 * @date 2022/11/14
 * @version 1.0
 * @email zhangfuxing1010@163.com
 */
@RestController
public class CustomerController {

    private CustomerService service;

    @Autowired
    public void setService(CustomerService service) {
        this.service = service;
    }


    @GetMapping("/get")
    public Object getCustomer() {
        return service.getAll();
    }
}
