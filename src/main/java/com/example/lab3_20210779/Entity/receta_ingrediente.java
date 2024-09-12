package com.example.lab3_20210779.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="receta_ingrediente")
public class receta_ingrediente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idreceta_ingrediente", nullable = false)
    private Integer idreceta_ingrediente;

    @ManyToOne
    @JoinColumn(name = "idreceta")
    private receta idreceta;

    @ManyToOne
    @JoinColumn(name = "idingrediente")
    private ingrediente idingrediente;

    @ManyToOne
    @JoinColumn(name = "idunidad_medida")
    private unidad_medida idunidad_medida;

    @Column(name="cantidad")
    private Double cantidad;


}
