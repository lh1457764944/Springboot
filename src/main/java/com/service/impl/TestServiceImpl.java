package com.service.impl;

import com.mapper.TestMapper;
import com.pojo.TestBean;
import com.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 大数据老哥
 * @version V1.0
 * @Package com.service.impl
 * @File ：TestServiceImpl.java
 * @date 2021/12/8 10:35
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    @Qualifier("jdbcTemplate")
    private JdbcTemplate jdbcTemplate;
    @Override
    @Test
    public ArrayList<TestBean> getAll() {
        List<TestBean> query = jdbcTemplate.query("select * from test.student", new TestMapper());

        return (ArrayList<TestBean>) query;
    }
}
