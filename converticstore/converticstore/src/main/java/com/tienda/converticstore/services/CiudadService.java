package com.tienda.converticstore.services;


import com.tienda.converticstore.entities.Ciudades;
import com.tienda.converticstore.repository.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CiudadService {
    @Autowired
    private CiudadRepository ciudadRepository;

    public List<Ciudades> findAll(){
        return ciudadRepository.findAll();
    }

    public Optional<Ciudades> findById(Integer id){
        return ciudadRepository.findById(id);
    }


}
