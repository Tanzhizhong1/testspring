package com.yc;

import com.yc.springframework.steretype.MyComponentScan;
import com.yc.springframework.steretype.MyConfiguration;

/**
 * @program: testspring
 * @description:
 * @author: 啦啦啦
 * @create: 2021-04-05 14:28
 */
@MyConfiguration
@MyComponentScan(basePackages = {"com.yc.bean","com.yc.biz","com.yc.dao"})
public class MyAppConfig {
//    @Mybean
//    public HelloWorld hw(){  //method.invoke( MyAppConfig对象 . xxx  )
//        return new HelloWorld();
//    }
//
//    @Mybean
//    public HelloWorld hw2(){  //method.invoke( MyAppConfig对象 . xxx  )
//
//        return new HelloWorld();
//    }
}
