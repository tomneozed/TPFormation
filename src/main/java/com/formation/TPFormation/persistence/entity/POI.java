package com.formation.TPFormation.persistence.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name = "point")
@EqualsAndHashCode
@ToString
public class POI {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String nom;

    @Column(nullable = false)
    private String adresse;

    @Column
    private Double lat;

    @Column
    private Double lng;
}
