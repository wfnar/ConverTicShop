package com.tienda.converticstore.repository;

import com.tienda.converticstore.entities.Marcas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface MarcasRepository extends JpaRepository<Marcas, Integer>{
}
