package com.campuslands.agencia_inmoviliaria.Repositories.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "estado_inmueble")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstadoInmuebleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstadoInmueble;
    private String estado;
    private Double precio;
    @OneToOne(mappedBy = "estado_inmueble", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private InmuebleEntity inmueble;
}
