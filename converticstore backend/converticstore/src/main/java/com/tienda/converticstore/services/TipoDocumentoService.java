package com.tienda.converticstore.services;


import com.tienda.converticstore.entities.TipoDocumento;
import com.tienda.converticstore.repository.TipoDocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TipoDocumentoService {
    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;

    public List<TipoDocumento> findAll(){
        return tipoDocumentoRepository.findAll();
    }

    public Optional<TipoDocumento> findByid(Integer id){
        return  tipoDocumentoRepository.findById(id);
    }


}
