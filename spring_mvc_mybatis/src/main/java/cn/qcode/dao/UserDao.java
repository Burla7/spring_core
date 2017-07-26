package cn.qcode.dao;

import cn.qcode.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/6/16.
 */
@Repository
public interface UserDao {

    public User queryById(int id);

    public void save(User u);

    public void update(User u);

    public void delete(Integer id);

    public List<User> queryAll();
}
