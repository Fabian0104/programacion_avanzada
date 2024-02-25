package com.ceduk.streaming.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "cat_tipos")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CatTipo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idu_tipo")
    private Integer iduTipo;

    @Column(name = "des_tipo")
    private String descripcion;


}
