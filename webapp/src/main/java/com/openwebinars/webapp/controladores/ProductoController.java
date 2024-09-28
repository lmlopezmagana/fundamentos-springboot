package com.openwebinars.webapp.controladores;

import com.openwebinars.webapp.repositorios.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductoController {

    @Autowired
    private ProductoRepository repository;

    @GetMapping({"/", "/list", "/products"})
    public String todosLosProductos(Model model) {
        model.addAttribute("productos", repository.findAll());
        return "index";
    }

}
