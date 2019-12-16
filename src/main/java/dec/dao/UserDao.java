package dec.dao;


import dec.POJO.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
* dao接口
* 在xml文件中实现该方法
* 在service的实现类中 @Autowired该接口  以使用此方法
* 在controller中@Autowired serviceimpl 以调用该方法  service中直接返回dao的方法
*
*
* */
public interface UserDao {

    User selectUserByname(String name);

}
