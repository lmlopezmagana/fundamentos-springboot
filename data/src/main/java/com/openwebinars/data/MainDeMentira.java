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

        System.out.println("Obtener todos los productos");
        System.out.println("===========================");
        repo.findAll()
                .forEach(System.out::println);

        System.out.println();

        System.out.println();
        System.out.println("Obtener todos los ordenadores");
        System.out.println("===========================");
        repo.findByNombreIgnoreCase("ordenador")
                .forEach(System.out::println);
        System.out.println();


        System.out.println("Obtener todos los productos que contengan un n");
        System.out.println("===========================");
        repo.encontrarPorNombre("n")
                .forEach(System.out::println);
        System.out.println();


        System.out.println("Obtener todos los productos con precio [20,150]");
        System.out.println("===========================");
        repo.productosPorPrecio(20, 150)
                .forEach(System.out::println);
        System.out.println();

    }

}
