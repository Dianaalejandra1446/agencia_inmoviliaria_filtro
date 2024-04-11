package com.campuslands.agencia_inmoviliaria.Repositories.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "inmueble")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InmuebleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inmueble")
    private Long idInmueble;

    @JoinColumn(name = "id_estado_inmueble")
    @OneToOne(fetch = FetchType.LAZY)
    private EstadoInmuebleEntity idEstadoInmueble;

    @JoinColumn(name = "id_tipo_inmueble")
    @OneToOne
    private TipoEntity IdtipoInmueble;

    private Double superficie;
    private String direccion;

    @Column(name = "num_referencia")
    private Double numReferencia;

    @JoinColumn(name = "id_propietario")
    @OneToOne(cascade = CascadeType.ALL)
    private PropietarioEntity idPropietario;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonBackReference
    @JoinColumn(name = "id_visita")
    private VisitasEntity idVisita;

}
