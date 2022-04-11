package com.controller;

import com.pojo.RealtimeValue;
import com.pojo.Worksheet;
import com.service.RealtimeValueService;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.List;

/**
 * 类功能描述：generator big data Excel
 *
 * @author WangXueXing create at 19-4-13 下午10:23
 * @version 1.0.0
 */
@RestController
//@Slf4j
@RequestMapping("/write")
public class ExcelGeneratorController {

    @Autowired
    private RealtimeValueService realtimeValueService;


//    public static void main(String[] args) throws FileNotFoundException {
//        ExcelGeneratorController template = new ExcelGeneratorController ();
//        template.output2 ();
//    }

    /**
     * 生成数据量大的时候，该方法会出现内存溢出
     *
     * @throws FileNotFoundException
     */
//    public void output1() throws FileNotFoundException {
//        StringTemplateGroup stGroup = new StringTemplateGroup ("stringTemplate");
//        StringTemplate st4 = stGroup.getInstanceOf ("test/exportexcel/template/test");
//        List<Worksheet> worksheets = new ArrayList<> ();
//
//        File file = new File ("/home/barry/data/output.xls");
//        PrintWriter writer = new PrintWriter (new BufferedOutputStream (new FileOutputStream (file)));
//
//        for (int i = 0; i < 30; i++) {
//            Worksheet worksheet = new Worksheet ();
//            worksheet.setSheet ("第" + (i + 1) + "页");
//            List<Row> rows = new ArrayList<> ();
//            for (int j = 0; j < 6000; j++) {
//                Row row = new Row ();
//                row.setName1 ("zhangzehao");
//                row.setName2 ("" + j);
//                row.setName3 (i + " " + j);
//                rows.add (row);
//            }
//            worksheet.setRows (rows);
//            worksheets.add (worksheet);
//        }
//
//        st4.setAttribute ("worksheets", worksheets);
//        writer.write (st4.toString ());
//        writer.flush ();
//        writer.close ();
//        System.out.println ("生成excel完成");
//    }

    /**
     * 该方法不管生成多大的数据量，都不会出现内存溢出，只是时间的长短
     * 经测试，生成1800万数据，6~10分钟之间，3G大的文件，打开大文件就看内存是否足够大了
     * 数据量小的时候，推荐用jxls的模板技术生成excel文件，谁用谁知道，大数据量可以结合该方法使用
     *
     * @throws FileNotFoundException
     */
    @RequestMapping(value = "/output")
    public void output2() throws FileNotFoundException {
        long startTimne = System.currentTimeMillis ();
        StringTemplateGroup stGroup = new StringTemplateGroup ("stringTemplate");

        //写入excel文件头部信息
        StringTemplate head = stGroup.getInstanceOf ("template/head");
        File file = new File ("D:\\桌面\\output2.jxls");
        PrintWriter writer = new PrintWriter (new BufferedOutputStream (new FileOutputStream (file)));
        writer.print (head.toString ());
        writer.flush ();

        int sheets = 1;
//        int sheets = 1;
        //excel单表最大行数是65535
        int maxRowNum = 100;

        //写入excel文件数据信息
        for (int i = 0; i < sheets; i++) {
            StringTemplate body = stGroup.getInstanceOf ("template/body");
            Worksheet worksheet = new Worksheet ();
            worksheet.setSheet (" " + (i + 1) + " ");
            worksheet.setColumnNum (8);
            worksheet.setRowNum (maxRowNum);
            //将数据库数据导入execl中
            List<RealtimeValue> rows = realtimeValueService.getAllRealtimeValueService ();
//            List<Row> rows = new ArrayList<> ();
//            Date date = new Date ();
//            for(int j=0;j<maxRowNum;j++){
//                Row row = new Row();
////                row.setName1(""+new Random ().nextInt(100000));
//                row.setName1(Long.parseLong (""+new Random ().nextInt(100000)));
//                row.setName2("2021-12-31 16:16:53.0"+j+"0=0;1=0;2=0;3=0;4=0;5=0;");
//                row.setName3(i+"8_1_0_1_1_1_0"+j);
//                row.setName4 (new Timestamp (date.getTime ()));
//                rows.add(row);
////                worksheet.setRows (rows);
//            }
            worksheet.setRows (rows);
            body.setAttribute ("worksheet", worksheet);
            writer.print (body.toString ());
            writer.flush ();
            rows.clear();
            rows = null;
            worksheet = null;
            body = null;
            Runtime.getRuntime ().gc ();
            System.out.println ("正在生成excel文件的 sheet" + (i + 1));
        }

        //写入excel文件尾部
        writer.print ("</Workbook>");
        writer.flush ();
        writer.close ();
        System.out.println ("生成excel文件完成");
        long endTime = System.currentTimeMillis ();
        System.out.println ("用时=" + ((endTime - startTimne) / 1000) + "秒");
    }
}