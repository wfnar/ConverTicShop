package com.tienda.converticstore.services;

import com.tienda.converticstore.entities.Producto;
import com.tienda.converticstore.repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductosService {
    @Autowired
    private ProductosRepository productosRepository;

    public List<Producto> findAll(){
        return productosRepository.findAll();
    }
    public Optional<Producto> findById(Integer id){
        return productosRepository.findById(id);
    }

    public List<Producto> findByIdGenero(Integer idGenero){
        return productosRepository.findByIdGenero(idGenero);
    }

    public List<Producto> buscarPorGeneroYCaracteristica(String genero, String caracteristica) {
        List<Producto> productoList;
        List<Producto> productoList1 =productosRepository.findByGenero_GeneroContainingIgnoreCaseAndTalla_TallaContainingIgnoreCase(genero, caracteristica);
        List<Producto> productoList2 = productosRepository.findByGenero_GeneroContainingIgnoreCaseAndCategoria_CategoriaContainingIgnoreCase(genero, caracteristica);
        List<Producto> productoList3 = productosRepository.findByGenero_GeneroContainingIgnoreCaseAndMarca_MarcaContainingIgnoreCase(genero, caracteristica);
        List<Producto> productoList4 = productosRepository.findByGenero_GeneroContainingIgnoreCaseAndColor_ColorContainingIgnoreCase(genero, caracteristica);
        if(!productoList1.isEmpty()){
            productoList =productoList1;
        } else if (!productoList2.isEmpty()) {
            productoList =productoList2;
        }else if (!productoList3.isEmpty()) {
            productoList =productoList3;
        }else  {
            productoList =productoList4;
        }
        return productoList;
    }


}
