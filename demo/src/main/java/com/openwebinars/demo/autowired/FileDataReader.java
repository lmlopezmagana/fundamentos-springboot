package com.openwebinars.demo.autowired;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class FileDataReader implements DataReader{
    @Override
    public List<String> readData() {
        return List.of("Dummy data");
    }
}
