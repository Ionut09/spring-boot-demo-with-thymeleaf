package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import lombok.Data;

@Service
@Data
public class ExampleService {
    @Value("${value.from.properties.file}")
    private String value;

    @Value("${com.my.property-integer:23}")
    private int propertyInteger;
}
