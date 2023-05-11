package com.example.redis_project.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class SerializeBean {

    private static final ObjectMapper mapper = new ObjectMapper();

    private SerializeBean(){}

    public static <T> String getSerialize(T bean) throws JsonProcessingException {
        return mapper.writeValueAsString(bean);
    }

    public static <T> T getBean(String s, Class<T> clazz) throws JsonProcessingException {
        return mapper.readValue(s, clazz);
    }

}
