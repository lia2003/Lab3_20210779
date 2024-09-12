package com.example.lab3_20210779.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="receta_equipamiento")
public class receta_equipamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_recetaequipamiento", nullable = false)
    private Integer id_recetaequipamiento;

    @ManyToOne
    @JoinColumn(name = "idreceta")
    private receta idreceta;

    @ManyToOne
    @JoinColumn(name = "idequipamiento")
    private receta idequipamiento;
}
