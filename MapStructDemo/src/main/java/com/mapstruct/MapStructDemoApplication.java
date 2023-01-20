package com.mapstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class MapStructDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapStructDemoApplication.class, args);
       // System.out.println("MapStruct Demo");
    }

}
