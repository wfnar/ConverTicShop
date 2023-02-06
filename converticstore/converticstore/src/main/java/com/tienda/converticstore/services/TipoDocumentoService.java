package com.tienda.converticstore.services;


import com.tienda.converticstore.repository.TipoDocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TipoDocumentoService {
    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;



}
