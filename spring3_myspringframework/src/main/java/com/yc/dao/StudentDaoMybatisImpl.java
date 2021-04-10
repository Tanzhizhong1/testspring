package com.yc.dao;

import com.yc.springframework.steretype.MyRepository;

import java.util.Random;

/**
 * @program: testspring
 * @description:
 * @author: 啦啦啦
 * @create: 2021-04-04 14:49
 */
@MyRepository
public class StudentDaoMybatisImpl implements StudentDao{

    @Override
    public int add(String name) {
        System.out.println("mubatis 添加学生"+name);
        Random r = new Random();
        return  r.nextInt();
    }

    @Override
    public void update(String name) {
        System.out.println("mybatis 更新学生"+name);
    }
}
