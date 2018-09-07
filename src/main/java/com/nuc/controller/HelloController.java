package com.nuc.controller;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * @Author songJiangTao
 * @Description  springmvc的controller测试
 * @Date 9:52 2018/9/6
 * @Param
 * @return
 **/
@Controller
@RequestMapping("/helloController")
public class HelloController {
    public HelloController(){
        System.out.println("单例构造方法执行！");
    }

    //第一种：通过ModelAndView返回index路径
    @RequestMapping("/helloWord")
    public ModelAndView helloWord(){
        //带参数的ModelAndView，直接设定返回的view
        ModelAndView md = new ModelAndView("index");
        return md;
    }

    //第二种：直接返回String类型系统会自动封装到ModelAndView中
    @RequestMapping("/helloWord1")
    public String helloWord1(){
        return "index";
    }

    //date日期格式转换
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class,
                new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }
}
