package com.ceduk.streaming.repositories;

import com.ceduk.streaming.entities.CtlMultimedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CtlMultimediaRepository extends JpaRepository<CtlMultimedia, Integer> {
    List<CtlMultimedia> findAllByGeneroIduGenero(Integer iduGenero);

    List<CtlMultimedia> findAllByClasificacionIduClasificacion(Integer iduClasificacion);

    List<CtlMultimedia> findAllByEstudioIduEstudio(Integer iduEstudio);

    List<CtlMultimedia> findAllByContenidoIduContenido(Integer iduContenido);
}

