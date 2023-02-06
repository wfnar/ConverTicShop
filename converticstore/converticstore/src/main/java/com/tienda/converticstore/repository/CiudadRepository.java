package com.tienda.converticstore.repository;

import com.tienda.converticstore.entities.Ciudades;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CiudadRepository extends JpaRepository<Ciudades, Integer> {
}
