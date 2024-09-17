package com.openwebinars.demo;

import com.openwebinars.demo.autowired.MiServicio;
import com.openwebinars.demo.beans.Query;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MainDeMentira {

    @Autowired
    private ApplicationContext ctx;

    //@Autowired
    //private MiServicio miServicio;

    @Autowired
    @Qualifier("apiQuery")
    private Query query;

    @PostConstruct
    public void init() {

        /*for (String s : ctx.getBeanDefinitionNames()) {
            System.out.println(">>> "+ s);
        }*/

        //miServicio.ejecutar();

        System.out.println(query.fetchData());

    }

}
