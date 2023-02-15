package com.tienda.converticstore.services;

import com.tienda.converticstore.entities.Usuario;
import com.tienda.converticstore.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class UsuarioService{
    @Autowired
    private UsuarioRepository usuarioRepository;

    public  List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }

    public Usuario findById(String idUsuario){
        return usuarioRepository.findById(idUsuario).orElse(null);
    }


    public Boolean login(String email, String password){
        Usuario usuario = usuarioRepository.findByEmailAndPassword(email, password);
        if (usuario != null){
            return true;
        }else{
            return false;
        }

    }


    public Usuario save(Usuario usuario){
        return usuarioRepository.save(usuario);
    }



}
