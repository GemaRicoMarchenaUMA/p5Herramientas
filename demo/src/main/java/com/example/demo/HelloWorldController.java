package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/saludo")
    public String decirHola() {
        return "¡Hello World! CONTROLADOR DE MARWA GRUPO G";
    }
}
