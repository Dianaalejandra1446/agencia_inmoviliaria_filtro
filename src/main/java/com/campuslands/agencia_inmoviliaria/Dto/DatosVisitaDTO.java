package com.campuslands.agencia_inmoviliaria.Dto;

import java.sql.Date;

import lombok.Data;
@Data
public class DatosVisitaDTO {
    private Long idDatosVisita;
    private Date fecha;
    private String hora;
    private String comentario;
}
