package com.yc;

import com.yc.biz.StudentBizImpl;
import com.yc.springframework.context.MyAnnotationConfigApplicationContext;
import com.yc.springframework.context.MyApplicationContext;

/**
 * @program: testspring
 * @description:
 * @author: 啦啦啦
 * @create: 2021-04-05 16:35
 */
public class Test {
    public static void main(String[] args) {
        //MyApplicationContext ac = new MyAnnotationConfigApplicationContext(MyAppConfig.class);
        //HelloWorld hw = (HelloWorld) ac.getBean("hw");
        //hw.show();

        MyApplicationContext ac = new MyAnnotationConfigApplicationContext(MyAppConfig.class);
        StudentBizImpl hw = (StudentBizImpl) ac.getBean("studentBizImpl");
        hw.add("abc");
    }
}
