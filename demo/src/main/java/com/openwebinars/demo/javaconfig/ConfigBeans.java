package com.openwebinars.demo.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBeans {


    @Bean
    public OtroBean otroBean() {
        return new OtroBean();
    }

}
