package com.openwebinars.webapp.repositorios;

import com.openwebinars.webapp.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
