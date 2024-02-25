package com.ceduk.streaming.controllers;

import com.ceduk.streaming.entities.CtlMultimedia;
import com.ceduk.streaming.service.CtlMultimediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/multimedias")
public class CtlMultimediaController {

    @Autowired
    private CtlMultimediaService service;

    @GetMapping
    public List<CtlMultimedia> getAllMultimedias(){
        return service.getAllMultimedias();
    }

    @GetMapping("/id/{id}")
    public Optional<CtlMultimedia> getMultimediaById(@PathVariable Integer id){
        return service.getMultimediaById(id);
    }

    @GetMapping("/genero/{genero}")
    public List<CtlMultimedia> getMultimediaByGenero(@PathVariable Integer genero){
        return service.getMultimediaByGenero(genero);
    }

    @GetMapping("/clasificacion/{clasificacion}")
    public List<CtlMultimedia> getMultimediaByClasificacion(@PathVariable Integer clasificacion){
        return service.getMultimediaByClasificacion(clasificacion);
    }

    @GetMapping("/estudio/{estudio}")
    public List<CtlMultimedia> getMultimediaByEstudio(@PathVariable Integer estudio){
        return service.getMultimediaByEstudio(estudio);
    }

    @GetMapping("/contenido/{contenido}")
    public List<CtlMultimedia> getMultimediaByContenido(@PathVariable Integer contenido){
        return service.getMultimediaByContenido(contenido);
    }

    @PostMapping
    public CtlMultimedia createMultimedia(@RequestBody CtlMultimedia multimedia){
        return service.createMultimedia(multimedia);
    }

    @PutMapping
    public CtlMultimedia updateMultimedia(@RequestBody CtlMultimedia multimedia){
        return service.updateMultimedia(multimedia);
    }

    @DeleteMapping("/id/{id}")
    public String deleteMultimediaById(@PathVariable Integer id){
        service.deleteMultimediaById(id);
        return "El registro ha sido eliminado correctamente";
    }
}
