package com.ceduk.streaming.controllers;

import com.ceduk.streaming.entities.CatEstudio;
import com.ceduk.streaming.service.CatEstudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estudios")
public class CatEstudioController {
    @Autowired
    private CatEstudioService service;

    @GetMapping
    public List<CatEstudio> getEstudiosAll(){
        return service.getEstudiosAll();
    }
    @GetMapping("/id/{id}")
    public Optional<CatEstudio> getEstudioById(@PathVariable Long id){
        return service.getEstudioById(id);
    }

    @PostMapping
        public CatEstudio postEstudio(@RequestBody CatEstudio estudio){
        return service.postEstudio(estudio);
    }

    @PutMapping
    public CatEstudio actualizarEstudio(@RequestBody CatEstudio estudio){
        return service.putEstudio(estudio);
    }

    @DeleteMapping("/id/{id}")
    public String eliminarEstudioById(@PathVariable Long id){
        service.deleteEstudioById(id);
        return "El registro ha sido eliminado correctamente";
    }
}
