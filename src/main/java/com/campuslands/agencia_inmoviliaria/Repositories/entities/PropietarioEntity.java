package com.campuslands.agencia_inmoviliaria.Repositories.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "propietario")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PropietarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_propietario")
    private Long idPropietario;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_persona")
    private List<PersonaEntity> idPersona;
    private String llavesInmueble;
    
    @OneToOne()
    private InmuebleEntity inmueble;
}
