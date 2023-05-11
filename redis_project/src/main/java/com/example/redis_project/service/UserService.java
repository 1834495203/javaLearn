package com.example.redis_project.service;

import com.example.redis_project.entity.MsgModel;
import com.example.redis_project.entity.User;
import jakarta.servlet.http.HttpSession;

public interface UserService {

    void addUser(User user);

    MsgModel register(String phone, HttpSession session);
}
