package com.gaospot.restservice;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Created by gao on 2018/9/28.
 */

@SpringBootApplication
public class WebApplication {
    public static Logger logger = LoggerFactory.getLogger(WebApplication.class);
    public static void main(String[] args) {
        logger.debug("this is debug info");
        logger.error("this is error info");
        SpringApplication.run(WebApplication.class, args);


    }
}
