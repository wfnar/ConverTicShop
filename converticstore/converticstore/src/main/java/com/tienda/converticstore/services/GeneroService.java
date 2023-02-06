package com.tienda.converticstore.services;


import com.tienda.converticstore.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GeneroService {
    @Autowired
    private GeneroRepository generoRepository;


}
