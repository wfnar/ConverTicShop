package com.tienda.converticstore.controller;

import com.tienda.converticstore.entities.TipoDocumento;
import com.tienda.converticstore.services.TipoDocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tipodocumento")
public class TipoDocumentoController {

    @Autowired
    private TipoDocumentoService tipoDocumentoService;

    @GetMapping("/all")
    public List<TipoDocumento> buscarTiposDocumentos(){
        return tipoDocumentoService.findAll();
    }



}
