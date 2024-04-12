package com.campuslands.agencia_inmoviliaria.Dto;

import java.util.List;

import lombok.Data;

@Data
public class ClienteDTO {
    private Long idCliente;
    private List<String> idPersona;
    private List<String> idDatosVisita;
}
