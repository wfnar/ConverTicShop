package com.tienda.converticstore.services;

import com.tienda.converticstore.entities.ItemOrdenCompra;
import com.tienda.converticstore.repository.ItemOrdenCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemOrdenCompraService {

    @Autowired
    private ItemOrdenCompraRepository itemOrdenCompraRepository;

    public List<ItemOrdenCompra> findAll(){
        return itemOrdenCompraRepository.findAll();
    }

    public Optional<ItemOrdenCompra> findById(Integer id){
        return itemOrdenCompraRepository.findById(id);
    }

}
