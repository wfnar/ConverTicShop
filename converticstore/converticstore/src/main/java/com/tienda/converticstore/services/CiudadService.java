package com.tienda.converticstore.services;

import com.tienda.converticstore.repository.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CiudadService {
    @Autowired
    private CiudadRepository ciudadRepository;



}
