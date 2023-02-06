package com.tienda.converticstore.services;

import com.tienda.converticstore.entities.Generos;
import com.tienda.converticstore.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GeneroService implements GeneroRepository{
    @Autowired
    private GeneroRepository generoRepository;

    @Override
    public <S extends Generos> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Generos> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Generos> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Generos> findAll() {
        return null;
    }

    @Override
    public Iterable<Generos> findAllById(Iterable<Integer> integers) {
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
    public void delete(Generos entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Generos> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
