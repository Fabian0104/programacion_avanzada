package com.ceduk.streaming.service;

import com.ceduk.streaming.entities.CatGenero;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CatGeneroService {
    List<CatGenero> getGeneros();

    Optional<CatGenero> getCatGeneroById(Long id);

    CatGenero postCatGenero(CatGenero genero);

    CatGenero putGenero(CatGenero genero);

    void deleteGeneroById(Long id);
}
