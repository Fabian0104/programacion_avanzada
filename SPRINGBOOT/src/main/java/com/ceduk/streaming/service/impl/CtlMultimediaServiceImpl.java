package com.ceduk.streaming.service.impl;

import com.ceduk.streaming.entities.CtlMultimedia;
import com.ceduk.streaming.repositories.CtlMultimediaRepository;
import com.ceduk.streaming.service.CtlMultimediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CtlMultimediaServiceImpl implements CtlMultimediaService {

    @Autowired
    private CtlMultimediaRepository repository;

    @Override
    public List<CtlMultimedia> getAllMultimedias() {
        return repository.findAll();
    }

    @Override
    public Optional<CtlMultimedia> getMultimediaById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public CtlMultimedia createMultimedia(CtlMultimedia multimedia) {
        return repository.save(multimedia);
    }

    @Override
    public void deleteMultimediaById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<CtlMultimedia> getMultimediaByGenero(Integer genero) {
        return repository.findAllByGeneroIduGenero(genero);
    }

    @Override
    public List<CtlMultimedia> getMultimediaByClasificacion(Integer clasificacion) {
        return repository.findAllByClasificacionIduClasificacion(clasificacion);
    }

    @Override
    public List<CtlMultimedia> getMultimediaByEstudio(Integer estudio) {
        return repository.findAllByEstudioIduEstudio(estudio);
    }

    @Override
    public List<CtlMultimedia> getMultimediaByContenido(Integer contenido) {
        return repository.findAllByContenidoIduContenido(contenido);
    }

    @Override
    public CtlMultimedia updateMultimedia(CtlMultimedia multimedia) {
        return repository.save(multimedia);
    }
}

