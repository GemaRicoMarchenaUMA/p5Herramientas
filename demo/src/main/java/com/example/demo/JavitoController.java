package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavitoController {
    @GetMapping("/javito")
    public String saludoJavito() {
        return "¡Hello World! CONTROLADOR DE JAVITO";
    }
}
