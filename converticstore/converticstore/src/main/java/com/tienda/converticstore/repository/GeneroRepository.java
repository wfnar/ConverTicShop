package com.tienda.converticstore.repository;

import com.tienda.converticstore.entities.Generos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends JpaRepository<Generos, Integer> {
}
