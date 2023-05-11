package com.example.redis_project.service.impl;

import cn.hutool.core.util.RandomUtil;
import com.example.redis_project.entity.MsgModel;
import com.example.redis_project.entity.User;
import com.example.redis_project.mapper.UserMapper;
import com.example.redis_project.service.UserService;
import com.example.redis_project.util.UserLog;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public MsgModel register(String phone, HttpSession session) {
        //用户注册功能

        //1. 校验手机号
        //2. 如不符合, 返回错误信息

        //3. 符合生成验证码
        String code = RandomUtil.randomNumbers(6);
        //4. 保存验证码到session
        session.setAttribute("code", code);
        //5. 发送验证码
        UserLog.UserLogs(UserServiceImpl.class).info("验证码为: "+code);
        return new MsgModel(202, "发送成功");
    }
}
