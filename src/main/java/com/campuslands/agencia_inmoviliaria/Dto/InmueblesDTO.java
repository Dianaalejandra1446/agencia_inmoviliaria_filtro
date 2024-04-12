package com.campuslands.agencia_inmoviliaria.Dto;

import java.util.List;

import lombok.Data;

@Data
public class InmueblesDTO {
    private Long idInmueble;

    private String estadoInmueble;

    private String tipoInmueble;

    private Double superficie;

    private String direccion;

    private Double numReferencia;

    private Long idPropietario;

    private Integer numVisitas;

}
