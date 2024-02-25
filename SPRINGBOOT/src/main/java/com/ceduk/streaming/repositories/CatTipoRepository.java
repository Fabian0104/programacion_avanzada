package com.ceduk.streaming.repositories;

import com.ceduk.streaming.entities.CatTipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CatTipoRepository extends JpaRepository<CatTipo, Integer> {
}
