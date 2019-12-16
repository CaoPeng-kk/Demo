package dao;

import dec.POJO.User;
import dec.dao.UserDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import webtest.BaseTest;

import java.util.List;


public class DaoTest extends BaseTest {

    @Autowired
    private UserDao dao;

    @Test
    public void fun1(){

        User user = dao.selectUserByname("张三");
        System.out.println(user.getName());
    }

}
