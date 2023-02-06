package com.tienda.converticstore.services;

import com.tienda.converticstore.entities.Paises;
import com.tienda.converticstore.repository.PaisRepository;
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
public class PaisService implements PaisRepository{

    @Autowired
    private PaisRepository paisRepository;


    @Override
    public void flush() {

    }

    @Override
    public <S extends Paises> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Paises> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Paises> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Paises getOne(Integer integer) {
        return null;
    }

    @Override
    public Paises getById(Integer idPais) {
        return paisRepository.getById(idPais);
    }

    @Override
    public Paises getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Paises> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Paises> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Paises> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Paises> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Paises> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Paises> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Paises, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Paises> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Paises> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Paises> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public List<Paises> findAll() {
        return paisRepository.findAll();
    }

    @Override
    public List<Paises> findAllById(Iterable<Integer> integers) {
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
    public void delete(Paises entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Paises> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Paises> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Paises> findAll(Pageable pageable) {
        return null;
    }
}
