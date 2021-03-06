package com.yc.biz;

import com.yc.AppConfig;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: testspring
 * @description:
 * @author: 啦啦啦
 * @create: 2021-04-04 15:34
 */
public class HelloWorldTest extends TestCase {
    private ApplicationContext ac;

    @Override
    @Before
    public  void setUp(){
        ac = new AnnotationConfigApplicationContext(AppConfig.class);
    }

    @Test
    public void testHello(){
        HelloWorld hw = (HelloWorld) ac.getBean("helloWorld");
        hw.hello();

        HelloWorld hw1 = (HelloWorld) ac.getBean("helloWorld");
        hw1.hello();
    }
}
