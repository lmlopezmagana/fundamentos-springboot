package com.openwebinars.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    List<Producto> findByPrecio(double precio);
    List<Producto> findByNombre(String nombre);
    List<Producto> findByNombreIgnoreCase(String nombre);

    @Query("select p from Producto p where p.nombre LIKE %?1%")
    List<Producto> encontrarPorNombre(String nombre);

    @Query("select p from Producto p where p.precio BETWEEN :min AND :max")
    List<Producto> productosPorPrecio(double min, double max);

}
