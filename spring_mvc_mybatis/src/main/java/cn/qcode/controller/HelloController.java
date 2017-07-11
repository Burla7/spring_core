package cn.qcode.controller;

import cn.qcode.entity.User;
import cn.qcode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2017/6/20.
 */
@Controller
public class HelloController {
    @Autowired
    private UserService userService;
    @RequestMapping("/index")
    public String index(HttpServletRequest request){
        List<User> users = userService.queryAll();
        request.setAttribute("user",users.get(0).getUserName());
        return "index";
    }
}
