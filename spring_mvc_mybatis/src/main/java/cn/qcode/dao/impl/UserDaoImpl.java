package cn.qcode.dao.impl;

import cn.qcode.dao.UserDao;
import cn.qcode.entity.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/6/16.
 */
@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public User queryById(int id) {
        return (User) sqlSessionTemplate.selectOne("queryById", id);
    }

    public void save(User u) {
        sqlSessionTemplate.insert("insert-user", u);
    }

    public void update(User u) {
        sqlSessionTemplate.update("update-user", u);
    }

    public void delete(Integer id) {
        sqlSessionTemplate.delete("delete-user",id);
    }

    public List<User> queryAll() {
        List<User> users = sqlSessionTemplate.selectList("queryAll");
        return users;
    }

}
