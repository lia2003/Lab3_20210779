package com.example.lab3_20210779.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="nutricion")
public class nutricion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idnutricion", nullable = false)
    private Integer idnutricion;

    @ManyToOne
    @JoinColumn(name = "idreceta")
    private receta idreceta;

    @Column(name="calorias")
    private Double calorias;

    @Column(name="grasas")
    private Double grasas;

    @Column(name="proteinas")
    private Double proteinas;

    @Column(name="carbohidratos")
    private Double carbohidratos;

    @Column(name="fibra")
    private Double fibra;
}
