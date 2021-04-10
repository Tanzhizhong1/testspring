package com.yc.biz;

import com.yc.dao.StudentDao;
import com.yc.springframework.steretype.MyResource;
import com.yc.springframework.steretype.MyService;

/**
 * @program: testspring
 * @description:
 * @author: Joe
 * @create: 2021-04-04 14:45
 */
@MyService
public class StudentBizImpl {

    private StudentDao studentDao;

    public StudentBizImpl(StudentDao studentDao){
        this.studentDao=studentDao;
    }

    public StudentBizImpl(){}

    //@Inject  //javax中的依赖注入 ，如果有多个对象，（比如这里有StudentDaoJpaImpl 和StudentDaoMybatisImpl对象）
    //因为有多个对象可以注入，所以这里必须用@Named("studentDaoJpaImpl"),如只有一个对象，则不需要写
    //@Autowired  //org.springframework
    //@Qualifier("studentDaoJpaImpl")  //如果有多个对象，（比如这里有StudentDaoJpaImpl 和StudentDaoMybatisImpl对象）
    //因为有多个对象可以注入，如只有一个对象，则不需要写

    public StudentDao getStudentDao(){
        return studentDao;
    }

    @MyResource(name="studentDaoJpaImpl")
    public void setStudentDao(StudentDao studentDao){
        this.studentDao=studentDao;
    }

    public int add(String name){
        System.out.println("业务层======");
        System.out.println("用户是否重名");
        int result=studentDao.add(name);
        System.out.println("业务层结束=====");
        return result;
    }

    public void update(String name){
        System.out.println("业务层=====");
        System.out.println("用户名是否重名");
        studentDao.update(name);
        System.out.println("业务操作结束");
    }

}
