package com.tienda.converticstore.controller;

import com.tienda.converticstore.entities.OrdenCompra;
import com.tienda.converticstore.services.OrdenCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ordencompra")
public class OrdenCompraController {

    @Autowired
    private OrdenCompraService ordenCompraService;

    @GetMapping("/all")
    public List<OrdenCompra> verOrdenCompras(){
        return ordenCompraService.findAll();
    }

    @GetMapping("/{id}")
    public OrdenCompra buscarPorId(Integer idOrdenCompra){
        return ordenCompraService.findById(idOrdenCompra).orElse(null);
    }
}
