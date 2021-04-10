package com.yc.bean;

import com.yc.springframework.steretype.MyComponent;
import com.yc.springframework.steretype.MyPostConstruct;
import com.yc.springframework.steretype.MyPreDestroy;

/**
 * @program: testspring
 * @description:
 * @author: 啦啦啦
 * @create: 2021-04-05 14:18
 */

@MyComponent
public class HelloWorld {
    @MyPostConstruct
    public void setup(){
        System.out.println("MyPostConstruct");
    }

    @MyPreDestroy
    public void destroy() {
        System.out.println("MyPreDestroy");
    }

    public HelloWorld(){

        System.out.println("hello world 构造");
    }

    public void show(){

        System.out.println("show");
    }

}
