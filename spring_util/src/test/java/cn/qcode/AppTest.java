package cn.qcode;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void Test(){
        /*    OutClass outerClass = new OutClass();
            OutClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.display();*/


        long s_time = System.currentTimeMillis();

        String a = "a";
        for(int i = 0 ; i < 100000 ; i++){
            a += "b";
        }
        long e_time = System.currentTimeMillis();
        System.out.println("  +   所消耗的时间：" + (e_time - s_time) + "毫秒");

         s_time = System.currentTimeMillis();

        StringBuffer aSb = new StringBuffer("a");
        for(int i = 0 ; i < 100000 ; i++){
            aSb.append("b");
        }
         e_time = System.currentTimeMillis();

        System.out.println("  +   所消耗的时间：" + (e_time - s_time) + "毫秒");


        s_time = System.currentTimeMillis();

        String aC = "a";
        for(int i = 0 ; i < 100000 ; i++){
            aC = aC.concat("b");
        }
        e_time = System.currentTimeMillis();

        System.out.println("  +   所消耗的时间：" + (e_time - s_time) + "毫秒");



    }

}
