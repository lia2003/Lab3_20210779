package com.example.lab3_20210779.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="unidad_medida")
public class unidad_medida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idunidad_medida", nullable = false)
    private Integer idunidad_medida;

    @Column(name="nombre_unidad", length = 45)
    private String nombre_unidad;

    @Column(name="simbolo", length = 10)
    private String simbolo;
}
