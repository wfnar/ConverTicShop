package com.tienda.converticstore.services;

import com.tienda.converticstore.entities.TipoDocumento;
import com.tienda.converticstore.repository.TipoDocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TipoDocumentoService implements TipoDocumentoRepository{
    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;

    @Override
    public <S extends TipoDocumento> S save(S entity) {
        return null;
    }

    @Override
    public <S extends TipoDocumento> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<TipoDocumento> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<TipoDocumento> findAll() {
        return null;
    }

    @Override
    public Iterable<TipoDocumento> findAllById(Iterable<Integer> integers) {
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
    public void delete(TipoDocumento entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends TipoDocumento> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
