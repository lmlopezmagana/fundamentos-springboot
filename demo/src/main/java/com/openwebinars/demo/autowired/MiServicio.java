package com.openwebinars.demo.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MiServicio {

    //@Autowired
    private /*final*/ MiRepositorio miRepositorio;

    @Autowired
    public MiServicio(MiRepositorio miRepositorio) {
        this.miRepositorio = miRepositorio;
    }

    public MiServicio() {
    }

    public void ejecutar() {
        miRepositorio.realizarOperacion();
    }


}
