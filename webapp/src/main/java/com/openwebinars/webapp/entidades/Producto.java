package com.openwebinars.webapp.entidades;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Producto {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    private String categoria;

    private double precio;

    private String imagen;

}
