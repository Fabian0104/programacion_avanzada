package com.ceduk.streaming.controllers;

import com.ceduk.streaming.entities.CatClasificacion;
import com.ceduk.streaming.service.CatClasificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clasificaciones")
public class CatClasificacionController {
    @Autowired
    private CatClasificacionService service;


    @GetMapping
    public List<CatClasificacion> getAllClasificaciones(){
        return service.getClasificacionesAll();
    }

    @GetMapping("/id/{id}")
    public Optional<CatClasificacion> consultarClasificacionById(@PathVariable Integer id){
        return service.getClasificacionById(id);
    }

    @GetMapping("/tipo/{tipo}")
    public List<CatClasificacion> getClasificacionByTipo(@PathVariable Integer tipo){
        return service.getClasificacionByTipo(tipo);
    }


    @PostMapping
    public CatClasificacion registrarClasificacion(@RequestBody CatClasificacion clasificacion){
        return service.postClasificacion(clasificacion);
    }

    @PutMapping
    public CatClasificacion actualizarClasificacion(@RequestBody CatClasificacion clasificacion){
        return service.putClasificacion(clasificacion);
    }

    @DeleteMapping("/id/{id}")
    public String eliminarClasificacionById(@PathVariable Integer id){
        service.deleteClasificacionById(id);
        return "El registro ha sido eliminado correctamente";
    }
}
