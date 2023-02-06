package com.tienda.converticstore.repository;


import com.tienda.converticstore.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {


}
