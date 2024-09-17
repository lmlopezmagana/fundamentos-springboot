package com.openwebinars.demo.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MiServicio {

    @Autowired
    private /*final*/ MiRepositorio miRepositorio;
    private DataUtils dataUtils;

    /*@Autowired
    public MiServicio(MiRepositorio miRepositorio) {
        this.miRepositorio = miRepositorio;
    }

    public MiServicio() {
    }

    @Autowired
    public void setMiRepositorio(MiRepositorio miRepositorio) {
        this.miRepositorio = miRepositorio;
    }*/

    @Autowired
    public void prepare(MiRepositorio miRepositorio, DataUtils dataUtils) {
        this.miRepositorio = miRepositorio;
        this.dataUtils = dataUtils;
    }

    public void ejecutar() {
        miRepositorio.realizarOperacion();
    }


}
