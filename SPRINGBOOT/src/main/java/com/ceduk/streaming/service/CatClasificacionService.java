package com.ceduk.streaming.service;

import com.ceduk.streaming.entities.CatClasificacion;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CatClasificacionService {

    List<CatClasificacion> getClasificacionesAll();

    Optional<CatClasificacion> getClasificacionById(Integer id);


    CatClasificacion postClasificacion(CatClasificacion clasificacion);

    void deleteClasificacionById(Integer id);

    List<CatClasificacion> getClasificacionByTipo(Integer tipo);

    CatClasificacion putClasificacion(CatClasificacion clasificacion);

}
