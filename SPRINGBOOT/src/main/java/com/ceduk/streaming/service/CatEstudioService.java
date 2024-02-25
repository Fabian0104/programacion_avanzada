package com.ceduk.streaming.service;

import com.ceduk.streaming.entities.CatEstudio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CatEstudioService {
    List<CatEstudio> getEstudiosAll();

    Optional<CatEstudio> getEstudioById(Long id);

    CatEstudio postEstudio(CatEstudio estudio);

    CatEstudio putEstudio(CatEstudio estudio);

    void deleteEstudioById(Long id);
}
