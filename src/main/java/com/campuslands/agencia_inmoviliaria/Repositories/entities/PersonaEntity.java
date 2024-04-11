package com.campuslands.agencia_inmoviliaria.Repositories.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "persona")
@AllArgsConstructor
@NoArgsConstructor
public class PersonaEntity {
    private Long idPersona;
}
