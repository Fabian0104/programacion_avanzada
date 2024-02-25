package com.ceduk.streaming.controllers;

import com.ceduk.streaming.entities.CatClasificacion;
import com.ceduk.streaming.entities.CatTipo;
import com.ceduk.streaming.service.CatTipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tipos")
public class CatTipoController {
    @Autowired
    private CatTipoService service;

    @GetMapping
    public List<CatTipo> getTiposAll() {
        return service.getTiposAll();
    }

    @GetMapping("/id/{id}")
    public Optional<CatTipo> getTipoById(@PathVariable Integer id) {
        return service.getTipoById(id);
    }

    @PostMapping
    public CatTipo postTipo(@RequestBody CatTipo tipo) {
        return service.postTipo(tipo);
    }

    @DeleteMapping("/id/{id}")
    public String deleteTipoById(@PathVariable Integer id) {
        service.deleteTipoById(id);
        return "El registro se ha elimindo correctamente";
    }

    @PutMapping
    public CatTipo actualizarCatTipo(@RequestBody CatTipo tipo){
        return service.putTipo(tipo);
    }

}




