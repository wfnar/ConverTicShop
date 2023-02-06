package com.tienda.converticstore.repository;

import com.tienda.converticstore.entities.Paises;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PaisRepository extends JpaRepository<Paises, Integer> {
}
