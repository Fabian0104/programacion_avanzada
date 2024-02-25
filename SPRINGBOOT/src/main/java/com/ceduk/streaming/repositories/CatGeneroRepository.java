package com.ceduk.streaming.repositories;

import com.ceduk.streaming.entities.CatGenero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CatGeneroRepository extends JpaRepository<CatGenero, Long> {
}
