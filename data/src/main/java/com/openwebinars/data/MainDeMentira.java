package com.openwebinars.data;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainDeMentira {

    @Autowired
    private ProductoRepository repo;


    @PostConstruct
    public void run() {

        Producto p = new Producto(null, "Un producto", 123.45);

        repo.save(p);

        repo.findAll()
                .forEach(System.out::println);


    }

}
