package com.example.redis_project.controller;

import com.example.redis_project.entity.MsgModel;
import com.example.redis_project.service.UserService;
import com.example.redis_project.util.UserLog;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public MsgModel addUser(@RequestBody String phone, HttpSession session){
        UserLog.UserLogs(UserController.class).info("用户手机号为:"+phone);
        return userService.register(phone, session);
    }

    @RequestMapping(value = "/reg", method = RequestMethod.POST)
    public MsgModel toRegister(@RequestBody String val, HttpSession session){
        UserLog.UserLogs(UserController.class).info("用户输入的验证码为:"+val);
        if (session.getAttribute("code").equals(val))
            return new MsgModel(202, "成功");
        return new MsgModel(404, "错误");
    }
}
