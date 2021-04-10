package com.yc.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: testspring
 * @description:
 * @author: 啦啦啦
 * @create: 2021-04-09 20:18
 */
@Aspect
@Component
public class LogAspect {

    //切入点的声明
    @Pointcut("execution(* com.yc.biz.StudentBizimpl.add*(..))")
    private void add(){

    }

    @Pointcut("execution(* com.yc.biz.StudentBizimpl.update())")
    private void update(){

    }

    @Pointcut("add() || update()")
    private void addAndUpdate(){

    }

    @Before("com.yc.aspect.LogAspect.add()")
    public void log(){
        System.out.println("==============前置增强的日志==============");
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd MM:mm:ss");
        String dstr = sdf.format(d);
        System.out.println("执行时间为" + dstr);
        System.out.println("===================前置增强的日志结束HHHHH12321111111111111111111 ====================");
    }
}
