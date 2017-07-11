package cn.qcode.service;

import cn.qcode.dao.UserDao;
import cn.qcode.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/6/16.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User queryById(int id){

        return userDao.queryById(id);
    };

    public void save(User u){
         userDao.save(u);
    };

    public void update(User u){
        userDao.update(u);
    };

    public void delete(Integer id){
        userDao.delete(id);
    };

    public List<User> queryAll(){
        return  userDao.queryAll();
    };
}
