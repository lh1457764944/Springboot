package com.pojo;

import java.sql.Timestamp;

/**
 * 采集实时数据表
 * @author liuheng
 * @date 2021/12/8
 */
//@Entity
//@Table(name = "zrzn_realtime_value")
public class RealtimeValue {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    @Column(name = "resource_id")
    private String resource_id;
//    @Column(name = "save_time")
    private Timestamp save_time;
//    @Column(name = "real_value")
    private String real_value;
//    @Column(name = "status")
    private Integer status;
//    @Column(name = "server_time")
    private Timestamp server_time;
//    @Column(name = "event_count")
    private String event_count;
//    @Column(name = "alias")
    private String alias;

    @Override
    public String toString() {
        return "RealtimeValue{" +
                "id=" + id +
                ", resource_id='" + resource_id + '\'' +
                ", save_time=" + save_time +
                ", real_value='" + real_value + '\'' +
                ", status=" + status +
                ", server_time=" + server_time +
                ", event_count='" + event_count + '\'' +
                ", alias='" + alias + '\'' +
                '}';
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResource_id() {
        return resource_id;
    }

    public void setResource_id(String resource_id) {
        this.resource_id = resource_id;
    }

    public Timestamp getSave_time() {
        return save_time;
    }

    public void setSave_time(Timestamp save_time) {
        this.save_time = save_time;
    }

    public String getReal_value() {
        return real_value;
    }

    public void setReal_value(String real_value) {
        this.real_value = real_value;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Timestamp getServer_time() {
        return server_time;
    }

    public void setServer_time(Timestamp server_time) {
        this.server_time = server_time;
    }

    public String getEvent_count() {
        return event_count;
    }

    public void setEvent_count(String event_count) {
        this.event_count = event_count;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public RealtimeValue(Long id, String resource_id, Timestamp save_time, String real_value, Integer status, Timestamp server_time, String event_count, String alias) {
        this.id = id;
        this.resource_id = resource_id;
        this.save_time = save_time;
        this.real_value = real_value;
        this.status = status;
        this.server_time = server_time;
        this.event_count = event_count;
        this.alias = alias;
    }

    public RealtimeValue() {
    }
}
