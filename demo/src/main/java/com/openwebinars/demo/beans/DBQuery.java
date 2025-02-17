package com.openwebinars.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

//@Primary
//@Component
public class DBQuery implements Query{

    @Value("${query.db.message}")
    private String message;

    @Override
    public List<String> fetchData() {
        //return List.of("fetching","data","from","database");
        return List.of(message);
    }
}
