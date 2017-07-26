package cn.qcode.controller;

import cn.qcode.entity.User;
import cn.qcode.service.UserService;
import cn.qcode.service.UserServiceImpl;
import cn.qcode.utils.restmodel.RestError;
import cn.qcode.utils.restmodel.RestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by jiaqi.zhang on 2017/6/20.
 */
@Controller
public class HelloController {
    @Autowired
    private UserService userServiceImpl;
    @RequestMapping("/queryAll")
    @ResponseBody
    public RestResult<List<User>> index(HttpServletRequest request){
        List<User> users = userServiceImpl.queryAll();
        return new RestResult<List<User>>().setData(users);
    }
    @RequestMapping("/qyeryById/{id}")
    @ResponseBody
    public  RestResult<User> qyeryById(@PathVariable String id){
        try {
            User user = userServiceImpl.queryById(Integer.parseInt(id));
            return new RestResult<User>().setData(user);
        }catch (Exception e){
            e.printStackTrace();
            RestError error = new RestError().setErrorInfo(e.getMessage()).setErrorCode("2001");
            return new RestResult<User>().setError(error);
        }
    }
    @RequestMapping("/deleteById/{id}")
    @ResponseBody
    public RestResult<Boolean> deleteById(@PathVariable String id){
        try {
             userServiceImpl.delete(Integer.parseInt(id));
            return new RestResult<Boolean>().setData(true);
        }catch (Exception e){
            e.printStackTrace();
            RestError error = new RestError().setErrorInfo(e.getMessage()).setErrorCode("2001");
            return new RestResult<Boolean>().setError(error).setData(false);
        }
    }
    @RequestMapping("/saveOrUpdate")
    @ResponseBody
    public RestResult<Boolean> index(User user){

        try {
            userServiceImpl.save(user);
            return new RestResult<Boolean>().setData(true);
        }catch (Exception e){
            e.printStackTrace();
            RestError error = new RestError().setErrorInfo(e.getMessage()).setErrorCode("2001");
            return new RestResult<Boolean>().setError(error).setData(false);
        }
    }
}
