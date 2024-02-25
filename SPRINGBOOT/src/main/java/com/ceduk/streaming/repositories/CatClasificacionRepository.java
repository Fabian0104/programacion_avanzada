package com.ceduk.streaming.repositories;

import com.ceduk.streaming.entities.CatClasificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CatClasificacionRepository  extends JpaRepository<CatClasificacion, Integer> {

    List<CatClasificacion> findAllByTipoIduTipo(Integer iduTipo);
}
