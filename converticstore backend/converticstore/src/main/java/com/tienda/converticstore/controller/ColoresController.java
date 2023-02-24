package com.tienda.converticstore.controller;

import com.tienda.converticstore.entities.Ciudades;
import com.tienda.converticstore.entities.Colores;
import com.tienda.converticstore.services.ColoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/colores")
public class ColoresController {

    @Autowired
    private ColoresService coloresService;

    @GetMapping("/all")
    public List<Colores> verColores(){
        return coloresService.findAll();
    }

    @GetMapping("/{id}")
    public Colores buscarPorId(@PathVariable("id") Integer idColores){
        return coloresService.findById(idColores).orElse(null);
    }
}
