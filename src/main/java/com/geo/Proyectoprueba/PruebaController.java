package com.geo.Proyectoprueba;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PruebaController {
    @GetMapping("/hola")
    public String holaMundo() {
        return "Jorge Probando";
    }
}