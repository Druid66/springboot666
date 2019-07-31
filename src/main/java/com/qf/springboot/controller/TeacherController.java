package com.qf.springboot.controller;

import com.qf.springboot.entity.Teacher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @Author Object
 * @Date 2019/7/30
 */
@RestController
@RequestMapping("teacher")
public class TeacherController {
    @RequestMapping("add")
    private String add(@Valid Teacher teacher){
        System.out.println(teacher);
        return "success";
    }
}
