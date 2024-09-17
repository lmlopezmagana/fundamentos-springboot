package com.openwebinars.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class FileQuery implements Query {

    @Value("${query.file.message}")
    private String message;

    @Override
    public List<String> fetchData() {
        return List.of(message);
    }
}
