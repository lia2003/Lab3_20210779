package com.example.lab3_20210779.Entity;
import jakarta.persistence.*;

@Entity
@Table(name="ingrediente")
public class ingrediente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idingrediente", nullable = false)
    private Integer idingrediente;

    @Column(name="nombre", length = 45)
    private String nombre;

}
