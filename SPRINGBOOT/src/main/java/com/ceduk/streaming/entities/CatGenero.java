package com.ceduk.streaming.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "cat_generos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CatGenero implements Serializable {

    @Id
    @Column(name = "idu_genero")
    private Long iduGenero;

    @Column(name = "nom_genero")
    private String genero;
}
