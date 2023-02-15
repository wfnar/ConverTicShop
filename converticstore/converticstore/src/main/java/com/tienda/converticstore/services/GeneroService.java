package com.tienda.converticstore.services;


import com.tienda.converticstore.entities.Generos;
import com.tienda.converticstore.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class GeneroService {
    @Autowired
    private GeneroRepository generoRepository;

    public List<Generos> findAll(){
        return generoRepository.findAll();
    }

    public Optional<Generos> findByid(Integer id){
        return generoRepository.findById(id);
    }


}
