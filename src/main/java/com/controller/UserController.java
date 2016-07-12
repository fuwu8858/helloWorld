package com.controller;

/*import com.model.User;*/

import com.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by gjy on 2016/1/11.
 */
@Controller
@SessionAttributes("userLoginCount")
public class UserController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;
    @Autowired
    private  HttpSession session;
/*    @RequestMapping(value = "/register",method = {RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public User register(User user){
        userService.addUser(user);
        return user;
    }*/
    @RequestMapping(value = "/login",method = {RequestMethod.POST,RequestMethod.GET})

    public ModelAndView login(ModelAndView modelAndView){


        int userLoginCount=session.getAttribute("userLoginCount")!=null? Integer.parseInt(session.getAttribute("userLoginCount").toString()):0;
        logger.info("用户跳转到登录页面的次数前【{}】",userLoginCount++);

        modelAndView.addObject("userLoginCount", userLoginCount);

        logger.info("用户跳转到登录页面的次数后【{}】",userLoginCount);

        modelAndView.setViewName("login");

        return modelAndView;
    }
    @RequestMapping(value = "/loginbody",method = {RequestMethod.POST,RequestMethod.GET})

    public ModelAndView loginbody(ModelAndView modelAndView){
        modelAndView.addObject("loginCount", 5);
        modelAndView.setViewName("loginbody");

        return modelAndView;
    }
}
