package com.ceduk.streaming.service.impl;

import com.ceduk.streaming.entities.CatClasificacion;
import com.ceduk.streaming.repositories.CatClasificacionRepository;
import com.ceduk.streaming.service.CatClasificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CatClasificacionServiceimpl implements CatClasificacionService {

    @Autowired
    private CatClasificacionRepository repository;

    @Override
    public List<CatClasificacion> getClasificacionesAll() {
        return repository.findAll();
    }

    @Override
    public Optional<CatClasificacion> getClasificacionById(Integer id) {
        return repository.findById(id);
    }


    @Override
    public CatClasificacion postClasificacion(CatClasificacion clasificacion) {
        return repository.save(clasificacion);
    }

    @Override
    public void deleteClasificacionById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<CatClasificacion> getClasificacionByTipo(Integer tipo) {
        return repository.findAllByTipoIduTipo(tipo);
    }

    @Override
    public CatClasificacion putClasificacion(CatClasificacion clasificacion) {
        Optional<CatClasificacion> optionalCatClasificacion = getClasificacionById(clasificacion.getIduClasificacion());

        if (optionalCatClasificacion.isPresent()){
            CatClasificacion catClasificacion = optionalCatClasificacion.get();
            catClasificacion.setNombre(catClasificacion.getNombre());
            catClasificacion.setDescripcion(clasificacion.getDescripcion());    
            catClasificacion.setTipo(clasificacion.getTipo());
            return repository.save(catClasificacion);
        }
        return null;
    }

}