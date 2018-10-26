package com.basic.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: spring-boot
 * @description: 测试控制器
 * @author: Mr.Dong
 * @create: 2018-10-25 19:09
 **/

@Controller
public class TestController {

    @RequestMapping("/test01")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView();
        Map<String, Object> map = new HashMap<>();
        map.put("name", "董修严");
        map.put("age", 22);
        mav.addObject(map);
        mav.setViewName("index");
        return mav;
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {

        return "2121212";
    }


}
