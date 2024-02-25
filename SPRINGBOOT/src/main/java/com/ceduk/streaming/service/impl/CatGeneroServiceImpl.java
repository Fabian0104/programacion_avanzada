package com.ceduk.streaming.service.impl;

import com.ceduk.streaming.entities.CatGenero;
import com.ceduk.streaming.repositories.CatGeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ceduk.streaming.service.CatGeneroService;

import java.util.List;
import java.util.Optional;

@Service
public class CatGeneroServiceImpl implements CatGeneroService {

    @Autowired
    private CatGeneroRepository repository;

    @Override
    public List<CatGenero> getGeneros() {
        return repository.findAll();
    }


    @Override
    public Optional<CatGenero> getCatGeneroById(Long id) {
        return repository.findById(id);
    }

    @Override
    public CatGenero postCatGenero(CatGenero genero) {
        return repository.save(genero);
    }

    @Override
    public CatGenero putGenero(CatGenero genero) {
        return repository.save(genero);
    }

    @Override
    public void deleteGeneroById(Long id) {
        repository.deleteById(id);
    }

}
