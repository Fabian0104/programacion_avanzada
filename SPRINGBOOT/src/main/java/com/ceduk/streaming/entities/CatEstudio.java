package com.ceduk.streaming.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "cat_estudios")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CatEstudio implements Serializable {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name = "idu_estudio")
    private Long iduEstudio;

    @Column(name = "nom_estudio")
    private String nombre;
}
