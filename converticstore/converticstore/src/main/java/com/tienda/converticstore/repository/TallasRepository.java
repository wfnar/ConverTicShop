package com.tienda.converticstore.repository;

import com.tienda.converticstore.entities.Tallas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TallasRepository extends JpaRepository<Tallas, Integer> {
}
