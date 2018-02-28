/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package org.spring.bean;

import org.spring.bean.event.TestPrint;
import org.spring.bean.test.HellowordService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhengweiliang
 * @date 2018/2/13.
 */

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        HellowordService hellowordService = (HellowordService)context.getBean("helloWordServiceImpl");
        hellowordService.sayHello();

        // print event
        TestPrint print = (TestPrint) context.getBean("printbean");
        print.print();
    }
}
