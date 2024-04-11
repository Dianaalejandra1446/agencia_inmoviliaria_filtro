package com.campuslands.agencia_inmoviliaria.Repositories.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "datos_visitas")
@AllArgsConstructor
@NoArgsConstructor
public class DatosVisitaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_datos_visita")
    private Long idDatosVisita;
    private Date fecha;
    private String hora;
    private String comentario;
}
