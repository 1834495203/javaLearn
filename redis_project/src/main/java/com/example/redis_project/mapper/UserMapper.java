package com.example.redis_project.mapper;

import com.example.redis_project.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    //添加信息
    void addUser(User user);

}
