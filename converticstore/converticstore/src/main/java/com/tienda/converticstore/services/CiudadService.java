package com.tienda.converticstore.services;

import com.tienda.converticstore.entities.Ciudades;
import com.tienda.converticstore.repository.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class CiudadService implements CiudadRepository{
    @Autowired
    private CiudadRepository ciudadRepository;


    @Override
    public <S extends Ciudades> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Ciudades> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Ciudades> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Ciudades> findAll() {
        return null;
    }

    @Override
    public Iterable<Ciudades> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Ciudades entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Ciudades> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
