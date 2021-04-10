import com.yc.biz.StudentBizimpl;
import com.yc.dao.StudentDao;
import com.yc.dao.StudentDaoJpaimpl;
import junit.framework.TestCase;

/**
 * @program: testspring
 * @description:
 * @author: 啦啦啦
 * @create: 2021-04-04 14:56
 */
public class StudentDaoTest extends TestCase{
    private StudentDao studentDao;
    private StudentBizimpl studentBizimpl;

    @Override
    public void setUp() throws Exception {

        studentDao = new StudentDaoJpaimpl();

        studentBizimpl = new StudentBizimpl();

        studentBizimpl.setStudentDao(studentDao);
    }

    public void testAdd(){studentDao.add("张三");}

    public  void testUpdate(){
        studentDao.update("张三");
    }

    public void testBizAdd(){
        studentBizimpl.add("张三");
    }
}
