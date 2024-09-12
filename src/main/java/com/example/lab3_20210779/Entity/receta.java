package com.example.lab3_20210779.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="receta")
public class receta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idreceta", nullable = false)
    private Integer idreceta;

    @Column(name="nombre", length = 200)
    private String nombre;

    @Column(name="instrucciones")
    private String instrucciones;

    @Column(name="dificultad")
    private Integer dificultad;

    @Column(name="tiempo_preparacion")
    private String tiempo_preparacion;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private categoria id_categoria;
}
