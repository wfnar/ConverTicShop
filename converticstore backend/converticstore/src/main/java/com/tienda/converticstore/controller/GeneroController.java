package com.tienda.converticstore.controller;


import com.tienda.converticstore.entities.Generos;
import com.tienda.converticstore.services.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/generos")
public class GeneroController {

    @Autowired
    private GeneroService generoService;
    @GetMapping("/all")
    public List<Generos> verGeneros(){
        return generoService.findAll();
    }
    @GetMapping("/{id}")
    public Generos buscarPorId(@PathVariable("id") Integer idGenero){
        return generoService.findByid(idGenero).orElse(null);
    }
}
