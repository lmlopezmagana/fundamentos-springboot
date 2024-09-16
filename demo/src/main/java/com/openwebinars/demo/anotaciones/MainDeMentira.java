package com.openwebinars.demo.anotaciones;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MainDeMentira {

    @Autowired
    private ApplicationContext ctx;

    @PostConstruct
    public void init() {

        for (String s : ctx.getBeanDefinitionNames()) {
            System.out.println(">>> "+ s);
        }


    }

}
