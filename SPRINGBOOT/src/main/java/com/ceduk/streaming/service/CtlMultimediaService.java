package com.ceduk.streaming.service;

import com.ceduk.streaming.entities.CtlMultimedia;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CtlMultimediaService {

    List<CtlMultimedia> getAllMultimedias();

    Optional<CtlMultimedia> getMultimediaById(Integer id);

    CtlMultimedia createMultimedia(CtlMultimedia multimedia);

    void deleteMultimediaById(Integer id);

    List<CtlMultimedia> getMultimediaByGenero(Integer genero);

    List<CtlMultimedia> getMultimediaByClasificacion(Integer clasificacion);

    List<CtlMultimedia> getMultimediaByEstudio(Integer estudio);

    List<CtlMultimedia> getMultimediaByContenido(Integer contenido);

    CtlMultimedia updateMultimedia(CtlMultimedia multimedia);
}
