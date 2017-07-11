package cn.qcode;

import cn.qcode.dao.UserDao;
import cn.qcode.entity.User;
import cn.qcode.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2017/6/16.
 */

public class APP {

    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userService = (UserDao) context.getBean(UserDao.class);
          List<User> users  =  userService.queryAll();
        for (User user : users) {
            System.out.println(user.getUserName());
        }




    }
}
