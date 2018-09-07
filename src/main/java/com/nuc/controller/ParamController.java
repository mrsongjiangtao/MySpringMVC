package com.nuc.controller;

import com.nuc.model.Student;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/*
 * @Author songJiangTao
 * @Description  参数的传递和接收
 * @Date 10:02 2018/9/6
 * @Param
 * @return
 **/
@Controller
@RequestMapping("/paramController")
public class ParamController {
    //访问testMap.jsp页面
    @RequestMapping("/testMapPage")
    public String testMapPage(){
        return "params/testMap";
    }

    //访问testMap2.jsp页面
    @RequestMapping("/testMapPage2")
    public String testMapPage2(){
        return "params/testMap2";
    }

    //访问model.jsp页面
    @RequestMapping("/model")
    public String model(){
        return "params/model";
    }

    //访问model2.jsp页面
    @RequestMapping("/model2")
    public String model2(){
        return "params/model";
    }

    //访问pojoMap.jsp页面
    @RequestMapping("/pojoMap")
    public String pojoMap(){
        return "params/pojoMap";
    }

    //访问pojoMap.jsp页面
    @RequestMapping("/pojoModel")
    public String pojoModel(){
        return "params/pojoModel";
    }

    //访问pojoMap.jsp页面
    @RequestMapping("/pojoModelMap")
    public String pojoModelMap(){
        return "params/pojoModelMap";
    }


    //@PathVariable来接收地址栏的值
    @RequestMapping("/inParam/{id}")
    public String inParam(@PathVariable("id") String id){//接收“{id}”这个本身
        System.out.println(id);
        return "params/id";
    }

    //获取testMap.jsp页面传入，要求方法参数名和页面name属性名一致
    //通过map返回信息并显示在页面testMapRes.jsp(第一种写法)
    //前端获取多个参数，返回map信息到解析器，显示在页面
    @RequestMapping(value = "testMap",method=RequestMethod.POST)
    public ModelAndView testMap(String name,
                          Integer age,
                          Date birth,
                          Integer[] fav){
        System.out.println(name+"~"+age+"~"+birth);
        if(fav!=null){
            for(Integer i:fav){
                System.out.println(i);
            }
        }
        Map<String,Object> map = new HashMap<>();
        map.put("name",name);
        map.put("age",age);
        map.put("birth",birth);
        map.put("fav",fav);
        return new ModelAndView("/params/testMapRes",map);
    }

    //通过map返回信息并显示在页面testMapRes.jsp(第二种写法)
    @RequestMapping(value = "testMap2",method=RequestMethod.POST)
    public String testMap2(String name,
                                Integer age,
                                Date birth,
                                Integer[] fav,
                                 Map<String,Object> map){
        System.out.println(name+"~"+age+"~"+birth);
        if(fav!=null){
            for(Integer i:fav){
                System.out.println(i);
            }
        }
        map.put("name",name);
        map.put("age",age);
        map.put("birth",birth);
        map.put("fav",fav);
        return "/params/testMapRes";
    }

    //前端获取多个参数，返回Model信息到解析器，显示在页面
    @RequestMapping("/modelPage")
    public String modelPage(String name,
                           Integer age,
                           Date birth,
                           Integer[] fav,
                            Model model){
//        System.out.println(name+"~"+age+"~"+birth);
//        if(fav!=null){
//            for(Integer i:fav){
//                System.out.println(i);
//            }
//        }
        model.addAttribute("name",name);
        model.addAttribute("age",age);
        model.addAttribute("birth",birth);
        model.addAttribute("fav",fav);
        return "/params/modelRes";
    }

    //前端获取多个参数，返回ModelMap信息到解析器，显示在页面
    @RequestMapping("/modelMapPage")
    public String modelMapPage(String name,
                            Integer age,
                            Date birth,
                            Integer[] fav,
                            ModelMap model){
        model.addAttribute("name",name);
        model.addAttribute("age",age);
        model.addAttribute("birth",birth);
        model.addAttribute("fav",fav);
        return "params/modelRes";
    }

    //前端获取一个类对象，返回map信息到解析器，显示在页面
    @RequestMapping(value = "pojoMap",method=RequestMethod.POST)
    public String pojoMap(Map<String,Object> map,
                          Student student){
        map.put("student",student);
        return "params/pojoMapRes";
    }

    //前端获取一个类，返货Model信息
    @RequestMapping(value = "pojoModel",method=RequestMethod.POST)
    public String pojoModel(Model model,
                          Student student){
        model.addAttribute("student",student);
        return "params/pojoModelRes";
    }
    //前端获取一个类，返货ModelMap信息
    @RequestMapping(value = "pojoModelMap",method=RequestMethod.POST)
    public String pojoModelMap(ModelMap modelMap,
                          Student student){
        modelMap.addAttribute("student",student);
        return "params/pojoModelMapRes";
    }

    //date日期格式转换
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class,
                new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }
}
