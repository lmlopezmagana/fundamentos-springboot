package com.openwebinars.demo.beans;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FileQuery implements Query {


    @Override
    public List<String> fetchData() {
        return List.of("fetching","data","from","file");
    }
}
