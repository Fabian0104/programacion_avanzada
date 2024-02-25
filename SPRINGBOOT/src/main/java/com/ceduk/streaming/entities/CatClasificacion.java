package com.ceduk.streaming.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "cat_clasificaciones")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CatClasificacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idu_clasificacion")
    private Integer iduClasificacion;

    @Column(name = "nom_clasificacion")
    private String nombre;

    @Column(name = "des_clasificacion")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "idu_tipo")
    private CatTipo tipo;
}
