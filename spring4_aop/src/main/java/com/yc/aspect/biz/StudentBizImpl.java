package com.yc.aspect.biz;

import com.yc.dao.StudentDao;

/**
 * @program: testspring
 * @description:
 * @author: 啦啦啦
 * @create: 2021-04-04 14:50
 */
public class StudentBizImpl {
    private StudentDao studentDao;

    public StudentBizImpl(StudentDao studentDao){
        this.studentDao = studentDao;
    }

    public StudentBizImpl(){

    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public int add(String name){
        System.out.println("=======业务层=====");
        System.out.println("用户名是否重名");
        int result = studentDao.add(name);
        System.out.println("=======业务层操作结束========");
        return  result;
    }

    public void update(String name){
        System.out.println("=======业务层=====");
        System.out.println("用户名是否重名");
        int result = studentDao.add(name);
        System.out.println("=======业务层操作结束========");
    }

}

