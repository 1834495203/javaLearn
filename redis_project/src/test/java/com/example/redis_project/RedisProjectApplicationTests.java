package com.example.redis_project;

import com.example.redis_project.entity.User;
import com.example.redis_project.service.UserService;
import com.example.redis_project.util.SerializeBean;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.io.Serializable;

@SpringBootTest
class RedisProjectApplicationTests {

    @Autowired
    private StringRedisTemplate stringTemplate;

    @Test
    void contextLoads() throws JsonProcessingException {
        User user = new User();
        user.setPassword("123");
        user.setPhone(123);
        user.setUid(1);
        user.setProfileName("unknown");
        user.setGender("男");

        String serialize = SerializeBean.getSerialize(user);
        stringTemplate.opsForValue().set("user", serialize);

        String s = stringTemplate.opsForValue().get("user");

        User bean = SerializeBean.getBean(s, User.class);
        System.out.println(bean.getProfileName());
    }

}
