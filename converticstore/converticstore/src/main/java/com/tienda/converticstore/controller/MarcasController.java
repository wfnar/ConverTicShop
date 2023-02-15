package com.tienda.converticstore.controller;


import com.tienda.converticstore.entities.Marcas;
import com.tienda.converticstore.services.MarcasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/marcas")
public class MarcasController {

    @Autowired
    private MarcasService marcasService;

    @GetMapping("/all")
    public List<Marcas> verMarcas(){
        return marcasService.findAll();
    }

    @GetMapping("/{id}")
    public Marcas buscarPorId(@PathVariable("id") Integer idMarca){
        return marcasService.findByid(idMarca).orElse(null);
    }


}
