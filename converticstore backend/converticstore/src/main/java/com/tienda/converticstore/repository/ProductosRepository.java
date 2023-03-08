package com.tienda.converticstore.repository;

import com.tienda.converticstore.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductosRepository extends JpaRepository<Producto, Integer> {

   public List<Producto> findByIdGenero(Integer idGenero);

   public List<Producto> findByGenero_GeneroContainingIgnoreCaseAndTalla_TallaContainingIgnoreCase(String genero,String caracteristica);
   public List<Producto> findByGenero_GeneroContainingIgnoreCaseAndCategoria_CategoriaContainingIgnoreCase(String genero,String caracteristica);
   public List<Producto> findByGenero_GeneroContainingIgnoreCaseAndColor_ColorContainingIgnoreCase(String genero,String caracteristica);
   public List<Producto> findByGenero_GeneroContainingIgnoreCaseAndMarca_MarcaContainingIgnoreCase(String genero,String caracteristica);

}
