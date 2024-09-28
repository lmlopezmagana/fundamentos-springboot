package com.openwebinars.webapp.repositorios;

import com.openwebinars.webapp.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long> {


    @Query("select distinct p.categoria from Producto p")
    List<String> listarCategorias();

    List<Producto> findByCategoriaIgnoreCase(String categoria);

}
