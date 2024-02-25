package com.ceduk.streaming.controllers;

import com.ceduk.streaming.entities.CatEstudio;
import com.ceduk.streaming.entities.CatGenero;
import com.ceduk.streaming.service.CatGeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/generos")
public class CatGeneroController {

    @Autowired
    private CatGeneroService service;

    @GetMapping
    public List<CatGenero> getCatGenero() {
        return service.getGeneros();
    }

    @GetMapping("/id/{id}")
    public Optional<CatGenero> getCatGeneroById(@PathVariable Long id){
        return service.getCatGeneroById(id);
    }

    @PostMapping
    public CatGenero postCatGenero(@RequestBody CatGenero genero){
        return service.postCatGenero(genero);
    }

    @PutMapping
    public CatGenero actualizarGenero(@RequestBody CatGenero genero){
        return service.putGenero(genero);
    }

    @DeleteMapping("/id/{id}")
    public String eliminarGeneroById(@PathVariable Long id){
        service.deleteGeneroById(id);
        return "El registro ha sido eliminado correctamente";
    }

}
