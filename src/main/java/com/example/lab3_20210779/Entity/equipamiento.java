package com.example.lab3_20210779.Entity;
import jakarta.persistence.*;

@Entity
@Table(name="ingrediente")
public class equipamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idequipamiento", nullable = false)
    private Integer idequipamiento;

    @Column(name="nombre", length = 100)
    private String nombre;

}
