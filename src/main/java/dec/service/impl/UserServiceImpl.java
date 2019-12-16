package dec.service.impl;

import dec.dao.UserDao;
import dec.POJO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dec.service.UserService;

import java.util.List;
import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao dao;
    @Override
    public User selectUserByname(User user) {
        User oldUser = dao.selectUserByname(user.getName());
        if(oldUser==null){
            return null;
        }else {
            return oldUser;
        }
    }
}
