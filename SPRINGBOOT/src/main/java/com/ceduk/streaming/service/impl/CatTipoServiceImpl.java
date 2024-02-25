package com.ceduk.streaming.service.impl;

import org.springframework.stereotype.Service;
import com.ceduk.streaming.entities.CatTipo;
import com.ceduk.streaming.repositories.CatTipoRepository;
import com.ceduk.streaming.service.CatTipoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Service
public class CatTipoServiceImpl implements CatTipoService {

    @Autowired
    private CatTipoRepository repository;

    @Override
    public List<CatTipo> getTiposAll() {
        return repository.findAll();
    }

    @Override
    public Optional<CatTipo> getTipoById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public CatTipo postTipo(CatTipo tipo) {
        return repository.save(tipo);
    }

    @Override
    public void deleteTipoById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public CatTipo putTipo(CatTipo tipo) {
        return repository.save(tipo);
    }


}