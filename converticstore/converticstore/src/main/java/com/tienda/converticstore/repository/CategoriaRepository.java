package com.tienda.converticstore.repository;

import com.tienda.converticstore.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
