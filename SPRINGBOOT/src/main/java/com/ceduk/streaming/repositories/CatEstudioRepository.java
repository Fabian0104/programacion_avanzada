package com.ceduk.streaming.repositories;

import com.ceduk.streaming.entities.CatEstudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CatEstudioRepository extends JpaRepository<CatEstudio, Long> {

    @Override
    List<CatEstudio> findAll();
}
