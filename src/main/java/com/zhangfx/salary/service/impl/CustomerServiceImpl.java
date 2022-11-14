package com.zhangfx.salary.service.impl;

import com.zhangfx.salary.mapper.TestMapper;
import com.zhangfx.salary.model.pojo.Customer;
import com.zhangfx.salary.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 张福兴
 * @version 1.0
 * @date 2022/11/14
 * @email zhangfuxing1010@163.com
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    private static final Logger log = LoggerFactory.getLogger(CustomerServiceImpl.class);

    private TestMapper testMapper;

    @Autowired
    public void setTestMapper(TestMapper testMapper) {
        this.testMapper = testMapper;
    }

    @Override
    public List<Customer> getAll() {
        return testMapper.getListById(1);
    }
}
