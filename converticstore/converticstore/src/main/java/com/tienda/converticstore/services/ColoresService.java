package com.tienda.converticstore.services;


import com.tienda.converticstore.entities.Colores;
import com.tienda.converticstore.repository.ColoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ColoresService {

    @Autowired
    private ColoresRepository coloresRepository;


    public List<Colores> findAll(){
        return coloresRepository.findAll();
    }

    public Optional<Colores> findById(Integer id){
        return coloresRepository.findById(id);
    }
}
