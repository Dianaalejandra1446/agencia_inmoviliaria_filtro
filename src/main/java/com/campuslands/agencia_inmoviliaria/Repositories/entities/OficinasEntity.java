package com.campuslands.agencia_inmoviliaria.Repositories.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "oficinas")
@AllArgsConstructor
@NoArgsConstructor
public class OficinasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOficina;
    @OneToMany(cascade = CascadeType.ALL)
    private ZonasEntity idZona;
}
