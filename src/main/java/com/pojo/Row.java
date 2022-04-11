package com.pojo;


import java.sql.Timestamp;

/**
 * @author liuheng
 * @date 2021/12/31
 */
public class Row {
    private Long name1;

    private String name2;

    private String name3;
    private Timestamp name4;

    public Timestamp getName4() {
        return name4;
    }

    public void setName4(Timestamp name4) {
        this.name4 = name4;
    }

    public Long getName1() {

        return name1;

    }

    public void setName1(Long name1) {

        this.name1 = name1;

    }

    public String getName2() {

        return name2;

    }

    public void setName2(String name2) {

        this.name2 = name2;

    }

    public String getName3() {

        return name3;

    }

    public void setName3(String name3) {

        this.name3 = name3;

    }


}
