package service;


import dec.POJO.User;
import dec.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import webtest.BaseTest;

public class ServiceTest extends BaseTest {

    @Autowired
    private UserService us;

    @Test
    public void fun2(){
        User u = new User();
        u.setName("张三");
        User twuser = us.selectUserByname(u);
        System.out.println(twuser.getName());

    }
}
