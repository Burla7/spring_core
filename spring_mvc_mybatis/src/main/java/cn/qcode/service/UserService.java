package cn.qcode.service;

import cn.qcode.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jiaqi,zhang on 2017/7/17.
 */

public interface UserService {

     User queryById(int id);
     void save(User u) throws Exception;

     void update(User u);

     void delete(Integer id);

     List<User> queryAll();
}
