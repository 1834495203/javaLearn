package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author GLaDOS
 * @date 2023/5/10 22:45
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("localhost:9090/**")
                .allowedHeaders("*")
                .allowedOrigins("*")
                .allowedOrigins("*")
                .allowedMethods("*")
                .allowCredentials(true);
    }
}
