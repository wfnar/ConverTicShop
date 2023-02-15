package com.tienda.converticstore.repository;

import com.tienda.converticstore.entities.ItemOrdenCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemOrdenCompraRepository extends JpaRepository<ItemOrdenCompra, Integer> {
}
