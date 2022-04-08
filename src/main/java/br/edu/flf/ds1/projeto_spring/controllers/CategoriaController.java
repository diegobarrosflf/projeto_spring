package br.edu.flf.ds1.projeto_spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoriaController {

    @GetMapping(path = "/categorias")
    public String findCategorias() {
        return "Categoria";
    }
}
