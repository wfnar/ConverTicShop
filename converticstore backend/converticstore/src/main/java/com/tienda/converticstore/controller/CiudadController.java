package com.tienda.converticstore.controller;


import com.tienda.converticstore.entities.Ciudades;
import com.tienda.converticstore.services.CiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ciudades")
public class CiudadController {

    @Autowired
    private CiudadService ciudadService;

    @GetMapping("/all")
    public List<Ciudades> verCiudades(){
        return ciudadService.findAll();
    }

    @GetMapping("/{id}")
    public Ciudades buscarPorId(@PathVariable("id") Integer idCiudad){
        return ciudadService.findById(idCiudad).orElse(null);
    }
}
