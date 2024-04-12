package com.example.lab2gtics.entity;


import jakarta.persistence.*;

@Entity
@Table

public class Shipper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ShipperID", nullable = false)
    private Integer idRgistro;

    @Column(name = )

}
