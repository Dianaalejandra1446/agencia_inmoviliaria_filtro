package com.campuslands.agencia_inmoviliaria.Repositories.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
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
@Table(name = "zonas")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ZonasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_zona")
    private Long idZona;
    @Column(name = "nombre_zona")
    private String nombreZona;
    private String ubicacion;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private OficinasEntity oficinasEntity;
}
