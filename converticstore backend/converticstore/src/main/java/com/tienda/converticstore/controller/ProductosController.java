package com.tienda.converticstore.controller;

import com.tienda.converticstore.entities.Producto;
import com.tienda.converticstore.services.ExceptionProduct;
import com.tienda.converticstore.services.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productos")
public class ProductosController {

    @Autowired
    private ProductosService productosService;

    @GetMapping("/all")
    public List<Producto> verProductos(){
        return productosService.findAll();
    }

    @GetMapping("/{id}")
    public Producto buscarPorId(@PathVariable("id") Integer idProducto){

        return productosService.findById(idProducto).orElse(null);
    }

    @GetMapping("/{genero}/{caracteristica}")
    public ResponseEntity<List<Producto>> buscarPorCaracteristica(@PathVariable(name = "genero") String genero,@PathVariable(name = "caracteristica") String caracteristica) {
        List<Producto> productoList;
        productoList = productosService.buscarPorGeneroYCaracteristica(genero,caracteristica);
        return new ResponseEntity<>(productoList, HttpStatus.OK);

    }
}
