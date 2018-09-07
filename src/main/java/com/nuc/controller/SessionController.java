package com.nuc.controller;

import com.nuc.model.Student;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/sessionController")
@SessionAttributes(value = {"student","name"})
public class SessionController {

    @ModelAttribute("student")
    public Student student(){
        return new Student();
    }

    //访问studentPage.jsp
    @RequestMapping("/studentPage")
    public String studentPage(){
        return "session/studentPage";
    }

    //访问singleParamPage.jsp
    @RequestMapping("/singleParamPage")
    public String singleParamPage(){
        return "session/singleParamPage";
    }

    //将student对象保存到session
    @RequestMapping(value = "/sessionStudent",method = RequestMethod.POST)
    public String sessionStudent(@ModelAttribute("student") Student student){
        System.out.println("Session:"+student);
        return "session/studentRes";
    }

    //将name参数保存到session
    @RequestMapping(value = "/singleParam",method=RequestMethod.POST)
    public String singleParam(Map<String,Object> map,
                              @RequestParam("name") String name){
        System.out.println("SessionName"+name);
        map.put("name",name);
        return "session/singleParamRes";
    }

    //清除session信息
    @RequestMapping("/clear")
    public String clear(ModelMap modelMap, SessionStatus status){
        if(modelMap.get("name")!=null){
            status.setComplete();//清除
        }
        return "session/clearRes";
    }

    //date日期格式转换
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class,
                new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }
}
