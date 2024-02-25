package com.ceduk.streaming.repositories;

import com.ceduk.streaming.entities.CtlContenido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CtlContenidoRepository extends JpaRepository<CtlContenido, Integer> {
}
