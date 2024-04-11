package com.campuslands.agencia_inmoviliaria.Repositories.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "villa")
@AllArgsConstructor
@NoArgsConstructor
public class VillaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVilla;
    private String urbanizacion;
    @Column(name = "tamaño_parcela")
    private Double tamañoParcela;
    @Column(name = "numero_estancias")
    private Integer numEstancias;
    @Column(name = "tipo_estancia")
    private String tipoEstancia;
}
