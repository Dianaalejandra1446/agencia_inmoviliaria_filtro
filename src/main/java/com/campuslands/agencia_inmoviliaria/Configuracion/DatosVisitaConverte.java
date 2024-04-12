package com.campuslands.agencia_inmoviliaria.Configuracion;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.campuslands.agencia_inmoviliaria.Dto.DatosVisitaDTO;
import com.campuslands.agencia_inmoviliaria.Repositories.entities.DatosVisitaEntity;

@Component
public class DatosVisitaConverte {
    @Autowired
    private ModelMapper dbm;
    
    public DatosVisitaEntity convertirDatosVisitaEntity(DatosVisitaDTO datosVisitaDTO){
        return dbm.map(datosVisitaDTO,DatosVisitaEntity.class);
    }

    public DatosVisitaDTO convertirDatosVisitaDTO(DatosVisitaEntity datosVisitaEntity){
        DatosVisitaDTO datosVisitaDTO = dbm.map(datosVisitaEntity, DatosVisitaDTO.class);
        datosVisitaDTO.setIdDatosVisita(datosVisitaEntity.getIdDatosVisita());
        datosVisitaDTO.setFecha(datosVisitaEntity.getFecha());
        datosVisitaDTO.setHora(datosVisitaEntity.getHora());
        datosVisitaDTO.setComentario(datosVisitaEntity.getComentario());

        return datosVisitaDTO;
    }
}
