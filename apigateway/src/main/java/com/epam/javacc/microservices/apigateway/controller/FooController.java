package com.epam.javacc.microservices.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.epam.javacc.microservices.apigateway.dto.Foo;

@RestController
public class FooController {

    @GetMapping("/foos/{id}")
    public Foo findById(@PathVariable("id") long id) {
        return new Foo(id, "StringName"+id+"lasted");
    }

}
