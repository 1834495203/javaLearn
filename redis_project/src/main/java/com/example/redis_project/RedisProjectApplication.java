package com.example.redis_project;

import com.example.redis_project.entity.User;
import com.example.redis_project.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RedisProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisProjectApplication.class, args);
    }

}
