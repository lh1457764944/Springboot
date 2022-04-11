package com.service;

import com.mapper.RealtimeValueMapper;
import com.pojo.RealtimeValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liuheng
 * @date 2022/1/4
 */
@Service
public class RealtimeValueService {
    @Autowired
    @Qualifier("jdbcTemplate")
    private JdbcTemplate jdbcTemplate;
    public List<RealtimeValue> getAllRealtimeValueService(){
        List<RealtimeValue> list= jdbcTemplate.query ("select * from test.zrzn_realtime_value limit 100", new RealtimeValueMapper());
        return list;
    }
}
