package com.example.lab3_20210779.Entity;
import jakarta.persistence.*;

@Entity
@Table(name="categoria")
public class categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idcategoria", nullable = false)
    private Integer idcategoria;

    @Column(name="categoria", length = 45)
    private String categoria;
}
