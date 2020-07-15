package com.imooc.helloworld.controller;


import com.imooc.helloworld.pojo.IMoocJSONResult;
import com.imooc.helloworld.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController //@RestController = @Controller + @ResponseBody
//@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUser")
    //@ResponseBody
    public User hello() {
        User u = new User();

        u.setName("imooc!!!");
        u.setAge(18);
        u.setBirthday(new Date());
        u.setPassword("imooc");
        u.setDesc("hello imooc!!!");

        return u;
    }

    @RequestMapping("/getUserJson")
    //@ResponseBody
    public IMoocJSONResult getUserJson() {
        User u = new User();

        u.setName("imooc");
        u.setAge(20);
        u.setBirthday(new Date());
        u.setPassword("imooc");
        u.setDesc("hello imooc!");

        return IMoocJSONResult.ok(u);
    }

}
