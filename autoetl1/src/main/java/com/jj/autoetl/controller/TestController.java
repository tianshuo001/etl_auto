package com.jj.autoetl.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/home")
public class TestController {

    @RequestMapping(value = "/page")
    @ResponseBody
    public ModelAndView showHomePage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "test");
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
