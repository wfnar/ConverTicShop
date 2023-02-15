package com.tienda.converticstore.services;

import com.tienda.converticstore.entities.Categoria;
import com.tienda.converticstore.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> findAll(){
        return categoriaRepository.findAll();
    }

    public Optional<Categoria> findById(Integer id){
        return categoriaRepository.findById(id);
    }
}
