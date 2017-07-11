package cn.qcode.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/6/20.
 */
@Controller
public class HelloController {
    private static final Logger logger = Logger.getLogger(HelloController.class);
    @Autowired
    @RequestMapping("/index")
    public String index(HttpServletRequest request){
        logger.info("info测试");
        logger.debug("debug测试 ");
        logger.error("error测试");
        return "index";
    }
}
