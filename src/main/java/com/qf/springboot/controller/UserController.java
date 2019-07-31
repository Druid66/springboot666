package com.qf.springboot.controller;

import com.qf.springboot.entity.Resource;
import com.qf.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @Author Object
 * @Date 2019/7/29
 */
@RestController
@RequestMapping("user")
public class UserController {
   /* @Value("${images.serverpath}")
    private String imageServer;

    @Value("${resource.emailServer}")
    private String emailServer;
*/
   @Autowired
   private Resource resource;
    @RequestMapping("property")
    private String property(){
        return resource.getImageServer();
    }
    @RequestMapping("hello")
    public String hello(){
        return "hello springboot!架构师";
    }
    @GetMapping("page")
    public String page(@RequestParam(name = "pageIndex",required = false,defaultValue = "1")Integer pageIndex){
        return "pageIndex"+pageIndex;
    }
    @GetMapping("page/{pageIndex}")
    public String page2(@PathVariable("pageIndex") Integer pageIndex){
        return "pageIndex"+pageIndex;
    }
    @PostMapping("add")
    public User add(User user){
       // user.setEntryDate(new Date());
        return user;
    }
}
