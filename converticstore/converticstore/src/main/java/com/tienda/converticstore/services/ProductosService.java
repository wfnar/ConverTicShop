package com.tienda.converticstore.services;

import com.tienda.converticstore.entities.Producto;
import com.tienda.converticstore.repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductosService {
    @Autowired
    private ProductosRepository productosRepository;

    public List<Producto> findAll(){
        return productosRepository.findAll();
    }
    public Optional<Producto> findById(Integer id){
        return productosRepository.findById(id);
    }
}
