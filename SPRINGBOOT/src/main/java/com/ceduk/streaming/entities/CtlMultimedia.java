package com.ceduk.streaming.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "ctl_multimedias")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CtlMultimedia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idu_multimedia")
    private Integer iduMultimedia;

    @Column(name = "nom_titulo")
    private String nomTitulo;

    @ManyToOne
    @JoinColumn(name = "idu_genero")
    private CatGenero genero;

    @ManyToOne
    @JoinColumn(name = "idu_clasificacion")
    private CatClasificacion clasificacion;

    @ManyToOne
    @JoinColumn(name = "idu_estudio")
    private CatEstudio estudio;

    @ManyToOne
    @JoinColumn(name = "idu_contenido")
    private CtlContenido contenido;
}

