package com.tienda.converticstore.repository;


import com.tienda.converticstore.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {

     public Optional<Usuario> findByEmailAndPassword(String email, String password);


}
