package cn.qcode;

import cn.qcode.dao.UserDao;
import cn.qcode.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Administrator on 2017/6/16.
 */

public class APP {

    public static void main(String[] args) {

/*

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userService = (UserDao) context.getBean(UserDao.class);
          List<User> users  =  userService.queryAll();
        for (User user : users) {
            System.out.println(user.getUserName());
        }
*/


        int firstEnglish, lastEnglish;
        char firstE = 'A', lastE = 'Z';      //获取首字母与末字母的值

        firstEnglish = (int)firstE;
        lastEnglish = (int)lastE;

        System.out.println("英文字母表： ");
        for(int i = firstEnglish; i <= lastEnglish; ++i)
        {
            char uppercase, lowercase;

            uppercase = (char)i;
            lowercase = (char)(i + 32);

            System.out.print("" + uppercase + lowercase);
        }

        System.out.println();


        System.out.println(firstEnglish);

    }
}
