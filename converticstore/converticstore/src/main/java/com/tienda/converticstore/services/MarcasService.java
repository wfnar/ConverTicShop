package com.tienda.converticstore.services;

import com.tienda.converticstore.entities.Marcas;
import com.tienda.converticstore.repository.MarcasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarcasService {
    @Autowired
    private MarcasRepository marcasRepository;

    public List<Marcas> findAll(){
        return marcasRepository.findAll();
    }

    public Optional<Marcas> findByid(Integer id){
        return marcasRepository.findById(id);
    }
}
