package com.tienda.converticstore.controller;

import com.tienda.converticstore.entities.Usuario;
import com.tienda.converticstore.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/all")
    public List<Usuario> getAllusers(){
        return usuarioService.findAll();
    }

    @PostMapping("/save")
    public Usuario save(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }


}
