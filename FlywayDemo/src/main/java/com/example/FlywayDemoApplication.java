package com.example;

import com.example.controller.UserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlywayDemoApplication {

    private  static final Logger logger= LoggerFactory.getLogger(UserController.class);

    public static void main(String[] args) {
        SpringApplication.run(FlywayDemoApplication.class, args);
        logger.debug("this is a debug message");
        logger.info("This is info message");
        logger.error("This is a error message");
        logger.warn("this is a warn message");

    }

}
