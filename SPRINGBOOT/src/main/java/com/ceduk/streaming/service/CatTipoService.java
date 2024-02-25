package com.ceduk.streaming.service;

import com.ceduk.streaming.entities.CatTipo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CatTipoService {
    List<CatTipo> getTiposAll();

    Optional<CatTipo> getTipoById(Integer id);

    CatTipo postTipo(CatTipo tipo);

    void deleteTipoById(Integer id);

    CatTipo putTipo(CatTipo tipo);
}
