package com.ceduk.streaming.service;

import com.ceduk.streaming.entities.CtlContenido;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CtlContenidoService {
    List<CtlContenido> getContenidosAll();

    Optional<CtlContenido> getContenidoById(Integer id);

    CtlContenido postContenido(CtlContenido contenido);

    void deleteContenidoById(Integer id);

    CtlContenido putContenido(CtlContenido contenido);
}
