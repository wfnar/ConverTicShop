package com.tienda.converticstore.controller;

import com.tienda.converticstore.entities.Paises;
import com.tienda.converticstore.services.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/paises")
public class PaisController {
    @Autowired
    private PaisService paisService;
    @GetMapping("/all")
    public ResponseEntity<List<Paises>> buscarPaises(){
        return new ResponseEntity<>(paisService.findAll(), HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public Paises buscarPorId(@PathVariable(name = "id") Integer idPais) {
        return paisService.findById(idPais).orElse(null);
    }


}
