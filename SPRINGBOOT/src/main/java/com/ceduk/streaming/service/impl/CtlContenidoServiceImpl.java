package com.ceduk.streaming.service.impl;

import com.ceduk.streaming.entities.CtlContenido;
import com.ceduk.streaming.repositories.CtlContenidoRepository;
import com.ceduk.streaming.service.CtlContenidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CtlContenidoServiceImpl implements CtlContenidoService {

    @Autowired
    CtlContenidoRepository repository;

    @Override
    public List<CtlContenido> getContenidosAll() {
        return repository.findAll();
    }

    @Override
    public Optional<CtlContenido> getContenidoById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public CtlContenido postContenido(CtlContenido contenido) {
        return repository.save(contenido);
    }

    @Override
    public void deleteContenidoById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public CtlContenido putContenido(CtlContenido contenido) {
        return repository.save(contenido);
    }


}
