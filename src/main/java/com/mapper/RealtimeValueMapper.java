package com.mapper;

import com.pojo.RealtimeValue;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author liuheng
 * @date 2022/1/4
 */
public class RealtimeValueMapper implements RowMapper<RealtimeValue> {
    @Override
    public RealtimeValue mapRow(ResultSet resultSet, int i) throws SQLException {
        RealtimeValue valueMapper = new RealtimeValue (
                resultSet.getLong ("id"),
                resultSet.getString ("resource_id"),
                resultSet.getTimestamp ("save_time"),
                resultSet.getString ("real_value"),
                resultSet.getInt ("status"),
                resultSet.getTimestamp ("server_time"),
                resultSet.getString ("event_count"),
                resultSet.getString ("alias")
                );
        return valueMapper;
    }
}
