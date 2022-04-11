package com.mapper;

import com.pojo.TestBean;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author 大数据老哥
 * @version V1.0
 * @Package com.mapper
 * @File ：TestMapper.java
 * @date 2021/12/8 10:35
 */
public class TestMapper implements RowMapper<TestBean> {
    @Override
    public TestBean mapRow(ResultSet resultSet, int i) throws SQLException {
        TestBean testBean = new TestBean();
        testBean.setId(resultSet.getString("id"));
        testBean.setStudent(resultSet.getString("student"));
        return testBean;
    }
}
