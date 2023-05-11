package com.example.redis_project.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

public class UserLog {

    private static Logger log;

    public static Logger UserLogs(Class<?> clazz){
        log = LoggerFactory.getLogger(clazz);
        return getLog();
    }

    private static Logger getLog() {
        return log;
    }

}
