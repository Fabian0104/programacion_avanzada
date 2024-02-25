package com.ceduk.streaming.controllers;

import com.ceduk.streaming.entities.CtlContenido;
import com.ceduk.streaming.service.CtlContenidoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contenidos")
public class CtlContenidoController {

    @Autowired
    private CtlContenidoService service;

    @GetMapping
    public List<CtlContenido> getContenidosAll(){
        return service.getContenidosAll();
    };

    @GetMapping("/id/{id}")
    public Optional<CtlContenido> getContenidoById(@PathVariable Integer id){
        return service.getContenidoById(id);
    }

    @PostMapping
    public CtlContenido postContenido(@RequestBody CtlContenido contenido){
        return service.postContenido(contenido);
    }

    @PutMapping
    public CtlContenido putContenido(@RequestBody CtlContenido contenido){
        return service.putContenido(contenido);
    }

    @DeleteMapping("/id/{id}")
    public  String deleteContenido(@PathVariable Integer id){
        service.deleteContenidoById(id);
        return "Se ha eliminado correctamente";
    }

}
