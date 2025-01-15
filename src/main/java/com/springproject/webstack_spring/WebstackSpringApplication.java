package com.springproject.webstack_spring;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebstackSpringApplication {
    private static LoggerFactory logger = LoggerFactory.getLogger(WebstackSpringApplication.class);
    public static void main(String[] args) {

        SpringApplication.run(WebstackSpringApplication.class, args);
    }
}
