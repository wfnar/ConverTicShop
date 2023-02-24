package com.tienda.converticstore.services;

import com.tienda.converticstore.entities.Paises;
import com.tienda.converticstore.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PaisService{

    @Autowired
    private PaisRepository paisRepository;

    public List<Paises> findAll() {
        return paisRepository.findAll();
    }


    public Optional<Paises> findById(Integer idPais) {
        return paisRepository.findById(idPais);
    }




}
