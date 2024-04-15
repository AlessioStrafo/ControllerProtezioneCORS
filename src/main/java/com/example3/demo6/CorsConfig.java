package com.example3.demo6;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

    @Configuration
    public class CorsConfig implements WebMvcConfigurer {
        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/v1/**")
                    .allowedOrigins("http://HelloWorld.com")
                    .allowedMethods("*")
                    .allowedHeaders("*");
        }
    }

