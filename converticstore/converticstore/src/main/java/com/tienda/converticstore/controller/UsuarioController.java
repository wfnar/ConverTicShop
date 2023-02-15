package com.tienda.converticstore.controller;

import com.tienda.converticstore.entities.Usuario;
import com.tienda.converticstore.repository.UsuarioRepository;
import com.tienda.converticstore.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/{idUsuario}")
    public Usuario getUsuerById(@PathVariable(name = "idUsuario") String idUsuario){
        return usuarioService.findById(idUsuario);
    }

    @PostMapping("/login")
    public ResponseEntity<Boolean>  login(@RequestBody Usuario usuario){

        Boolean loging = usuarioService.login(usuario.getEmail(), usuario.getPassword());

        if (loging == true){
            return new ResponseEntity<>(loging, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(loging, HttpStatus.NOT_FOUND);
        }

    }

    @PostMapping("/save")
    public Usuario save(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }


}
