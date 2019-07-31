package com.qf.springboot.controller;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.qf.springboot.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author Object
 * @Date 2019/7/30
 */
@Controller
@RequestMapping("page")
public class PageController {
    @RequestMapping("hello")
    public String hello(Model model){
       // int i = 1/0;
        String username = "杜兰特";
        Student student = new Student(1,"刘佳伟","123");
        model.addAttribute("student",student);
        model.addAttribute("username",username);
        model.addAttribute("money",1000);

        List<Student> slist = new ArrayList<>();
        slist.add(new Student(1,"zs","123"));
        slist.add(new Student(2,"ls","123"));
        model.addAttribute("stuList",slist);
        model.addAttribute("dates",new Date());
        return "hello";
    }
}
