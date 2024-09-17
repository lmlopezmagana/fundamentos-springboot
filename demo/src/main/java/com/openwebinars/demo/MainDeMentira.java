package com.openwebinars.demo;

import com.openwebinars.demo.autowired.MiServicio;
import com.openwebinars.demo.beans.Query;
import com.openwebinars.demo.scope.Servicio1;
import com.openwebinars.demo.scope.Servicio2;
import com.openwebinars.demo.scope.Servicio3;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
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

    //@Autowired
    //@Qualifier("apiQuery")
    //private Query query;

    @Autowired
    private Servicio1 s1;

    @Autowired
    private Servicio2 s2;

    @Autowired
    private Servicio3 s3;

    @PostConstruct
    public void init() {

        for (String s : ctx.getBeanDefinitionNames()) {
            System.out.println(">>> "+ s);
        }

        System.out.println(s1.utils);
        System.out.println(s2.utils);
        System.out.println(s3.utils);


        //miServicio.ejecutar();

       // System.out.println(query.fetchData());

    }

    @PreDestroy
    public void dispose() {
        System.out.println("Este bean se va a eliminar...");
    }

}
