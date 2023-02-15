package com.tienda.converticstore.services;

import com.tienda.converticstore.entities.Tallas;
import com.tienda.converticstore.repository.TallasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TallasService {

    @Autowired
    private TallasRepository tallasRepository;

    public List<Tallas> findAll(){
        return tallasRepository.findAll();
    }

    public Optional<Tallas> findByid(Integer id){
        return tallasRepository.findById(id);
    }

}
