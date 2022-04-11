package com.controller;

import com.pojo.TestBean;
import com.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author 大数据老哥
 * @version V1.0
 * @Package com.controller
 * @File ：TestController.java
 * @date 2021/12/8 10:28
 */
@RestController
//@Slf4j
@RequestMapping("/api")
public class TestController {
    @Autowired
    private TestService testService;
//    @Scheduled(cron = "* * * * * ? ")
    public void testAll() {
        ArrayList<TestBean> all = testService.getAll();
        System.out.println(all);
    }
}
