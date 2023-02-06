package com.tienda.converticstore.services;

import com.tienda.converticstore.repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductosService {
    @Autowired
    private ProductosRepository productosRepository;
}
