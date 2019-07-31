package com.qf.springboot.controller;

import com.qf.springboot.entity.ResultBean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Object
 * @Date 2019/7/30
 */
@ControllerAdvice
public class CommonExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBean<String> handleException(Exception e){
        return new ResultBean("500","你的操作有误，请稍后再试！");
    }
}
