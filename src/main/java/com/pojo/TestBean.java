package com.pojo;

/**
 * @author 大数据老哥
 * @version V1.0
 * @Package com.pojo
 * @File ：TestBean.java
 * @date 2021/12/8 10:35
 */
public class TestBean {
    private String id;
    private String student;

    @Override
    public String toString() {
        return "TestBean{" +
                "id='" + id + '\'' +
                ", student='" + student + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public TestBean() {
    }

    public TestBean(String id, String student) {
        this.id = id;
        this.student = student;
    }
}
