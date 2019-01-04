package com.jj.autoetl.controller;

import com.jj.autoetl.entity.User;
import com.jj.autoetl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public ModelAndView findByName(@RequestParam(value = "userName", required = true) String userName) {
        ModelAndView modelAndView = new ModelAndView();
        User user = userService.findByName(userName);
        modelAndView.addObject("user", user);
        modelAndView.setViewName("/user/show_user");
        return modelAndView;
    }
}
