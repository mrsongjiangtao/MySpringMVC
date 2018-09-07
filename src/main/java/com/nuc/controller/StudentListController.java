package com.nuc.controller;

import com.nuc.model.Student;
import com.nuc.model.StudentClass;
import com.nuc.model.StudentList;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/studentListController")
public class StudentListController {
    //访问studentClassPage.jsp
    @RequestMapping("/studentClassPage")
    public String studentClassPage(){
        return "list/studentClassPage";
    }

    //访问oneToMorePage.jsp
    @RequestMapping("/oneToMorePage")
    public String oneToMorePage(){
        return "list/oneToMorePage";
    }

    //访问oneToMorePageList.jsp
    @RequestMapping("/oneToMorePageList")
    public String oneToMorePageList(){
        return "list/oneToMorePageList";
    }
    //保存前端传来student对象，包括班级信息，一个student对象，对应一个班级
    //并返回学生信息至前端
    @RequestMapping(value = "/studentClass",method = RequestMethod.POST)
    public String studentClass(Model model,Student student){
        System.out.println(student);
        model.addAttribute(student);
        return "list/studentClassPageRes";
    }

    //保存前端传来的class班级对象，包括班级写生信息，一个班级可对应多个学生信息
    //并返回班级信息至前端
    @RequestMapping(value = "/oneToMore",method = RequestMethod.POST)
    public String oneToMore(Map<String,Object> map,
                            StudentClass studentClass){
        System.out.println(studentClass);
        map.put("sl",studentClass);
        return "list/oneToMorePageRes";
    }

    //上面的第二种方式
    @RequestMapping(value = "/studentList",method = RequestMethod.POST)
    public String studentList(StudentList studentList,
                              Map<String,Object> map,
                              StudentClass studentClass){
        List<Student> list = studentList.getList();
        if(list!=null){
            for(Student s:list){
                System.out.println(s);
            }
        }
        map.put("list",list);
        map.put("sl",studentClass);
        return "list/oneToMorePageListRes";
    }

    //date日期格式转换
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class,
                new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }
}
