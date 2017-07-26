package cn.qcode.service;

import cn.qcode.dao.UserDao;
import cn.qcode.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/6/16.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    public User queryById(int id){

        return userDao.queryById(id);
    }

    @Transactional(rollbackFor=Exception.class) //指定回滚,遇到异常Exception时回滚
    public void save(User u) throws Exception {

         userDao.save(u);
        throw new Exception("注释");

    };

    public void update(User u){
        userDao.update(u);
    };

    public void delete(Integer id){
        userDao.delete(id);
    };

    public List<User> queryAll(){
        return  userDao.queryAll();
    }
}
