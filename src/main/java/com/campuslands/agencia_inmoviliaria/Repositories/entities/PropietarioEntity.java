package com.campuslands.agencia_inmoviliaria.Repositories.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "propietario")
@AllArgsConstructor
@NoArgsConstructor
public class PropietarioEntity {
    private Long idPropietario;
    @ManyToOne(cascade = CascadeType.ALL)
    private PersonaEntity idPersona;
    private String llavesInmueble;
}
