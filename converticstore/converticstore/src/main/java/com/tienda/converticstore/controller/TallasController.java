package com.tienda.converticstore.controller;

import com.tienda.converticstore.entities.Tallas;
import com.tienda.converticstore.services.TallasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tallas")
public class TallasController {

    @Autowired
    private TallasService tallasService;

    @GetMapping("/all")
    public List<Tallas> buscarTallas(){
        return tallasService.findAll();
    }

    @GetMapping("/{id}")
    public Tallas buscarPorId(@PathVariable(name = "id") Integer idTalla){
        return tallasService.findByid(idTalla).orElse(null);
    }

}
