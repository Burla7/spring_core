package cn.qcode;

import cn.qcode.entity.Email;
import cn.qcode.entity.Person;
import org.junit.Test;

/**
 * Created by Administrator on 2017/7/10.
 */
public class CloneTest {


    @Test
    public void cloneTest(){
        //写封邮件
        Email email = new Email("请参加会议","请与今天12:30到二会议室参加会议...");

        Person person1 =  new Person("张三",email);

        Person person2 = CloneUtils.clone(person1);
        person2.setName("李四");
        Person person3 =  CloneUtils.clone(person1);
        person3.setName("王五");

        person1.getEmail().setContent("请与今天12:00到二会议室参加会议...");

        System.out.println(person1.getName() + "的邮件内容是：" + person1.getEmail().getContent());
        System.out.println(person2.getName() + "的邮件内容是：" + person2.getEmail().getContent());
        System.out.println(person3.getName() + "的邮件内容是：" + person3.getEmail().getContent());
    }
}
