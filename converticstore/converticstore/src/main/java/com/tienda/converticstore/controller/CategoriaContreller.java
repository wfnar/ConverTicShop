package com.tienda.converticstore.controller;


import com.tienda.converticstore.entities.Categoria;
import com.tienda.converticstore.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/catagoria")
public class CategoriaContreller {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/all")
    public List<Categoria> verCategorias(){
        return categoriaService.findAll();
    }

    @GetMapping("/{id}")
    public Categoria buscarPorId(@PathVariable("id") Integer idCategoria){
        return categoriaService.findById(idCategoria).orElse(null);
    }

}
