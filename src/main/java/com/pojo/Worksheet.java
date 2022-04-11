package com.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuheng
 * @date 2021/12/31
 */
public class Worksheet {
    private String sheet;

    private int columnNum;

    private int rowNum;

//    private List<Row> rows;
    private List<RealtimeValue> rows =new ArrayList<> ();


    public String getSheet() {

        return sheet;

    }



    public void setSheet(String sheet) {

        this.sheet = sheet;

    }

    public List<RealtimeValue> getRows() {
        return rows;
    }

    public void setRows(List<RealtimeValue> rows) {
        this.rows = rows;
    }
//    public List<Row> getRows() {
//
//        return rows;
//
//    }
//
//    public void setRows(List<Row> rows) {
//
//        this.rows = rows;
//
//    }

    public int getColumnNum() {

        return columnNum;

    }

    public void setColumnNum(int columnNum) {

        this.columnNum = columnNum;

    }

    public int getRowNum() {

        return rowNum;

    }

    public void setRowNum(int rowNum) {

        this.rowNum = rowNum;

    }


}
