package com.tienda.converticstore.repository;

import com.tienda.converticstore.entities.Colores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface ColoresRepository extends JpaRepository<Colores, Integer> {
}
