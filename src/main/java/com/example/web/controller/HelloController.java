package com.example.web.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/thymeleaf")
    public ModelAndView index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "localhost");
        // return模板文件的名称，对应src/main/resources/templates/thymeleaf.html
        ModelAndView modelAndView = new ModelAndView("thymeleaf");

        // 因为当前控制器已使用 RestController 注解，当需要返回视图时需使用ModelAndView 返回
        return modelAndView;
    }
}
