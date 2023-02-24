package com.tienda.converticstore.controller;

import com.tienda.converticstore.entities.ItemOrdenCompra;
import com.tienda.converticstore.services.ItemOrdenCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/itemordencompra")
public class ItemOrdenCompraController {

    @Autowired
    private ItemOrdenCompraService itemOrdenCompraService;

    @GetMapping("/all")
    public List<ItemOrdenCompra> verItemOrdenCompras(){
        return itemOrdenCompraService.findAll();
    }

    @GetMapping("/{id}")
    public ItemOrdenCompra buscarPorId(Integer idItemOrdenCompra){
        return itemOrdenCompraService.findById(idItemOrdenCompra).orElse(null);
    }
}
