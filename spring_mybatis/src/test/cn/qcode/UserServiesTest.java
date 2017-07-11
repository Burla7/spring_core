package cn.qcode;
import java.util.List;

import cn.qcode.entity.User;
import cn.qcode.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class UserServiesTest {

    @Autowired
     private  UserService userService;

    @Test
    public void testQueryById(){
        User u = userService.queryById(1);
        if(u != null){
            System.out.println(u);
        }
    }

    @Test
    public void testInsert() {
        for(int i = 0; i < 100; i++){
            User u = new User();
            u.setUserName("whh");
            u.setPassword("sb");
            userService.save(u);
        }
        System.out.println("保存成功！");
    }

    @Test
    public void testUpdate(){
        User u = userService.queryById(3);
        u.setUserName("scott");
        u.setPassword("scott");
        userService.update(u);
        System.out.println("修改成功！");
    }


    @Test
    public void testDelete(){
        int id = 4;
        userService.delete(id);

    }


    @Test
    public void testQueryAll(){
        List<User> users = userService.queryAll();
        if(users != null){
            for(int i = 0; i < users.size(); i++){
                System.out.println(users.get(i));
            }
        }
    }
}

