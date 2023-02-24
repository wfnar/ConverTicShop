package com.tienda.converticstore.services;

import com.tienda.converticstore.entities.OrdenCompra;
import com.tienda.converticstore.repository.OrdenCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdenCompraService {

    @Autowired
    private OrdenCompraRepository ordenCompraRepository;

    public List<OrdenCompra> findAll(){
        return ordenCompraRepository.findAll();
    }

    public Optional<OrdenCompra> findById(Integer id){
        return ordenCompraRepository.findById(id);
    }

}
