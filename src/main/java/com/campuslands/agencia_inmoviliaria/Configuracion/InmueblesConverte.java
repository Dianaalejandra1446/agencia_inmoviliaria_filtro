package com.campuslands.agencia_inmoviliaria.Configuracion;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.campuslands.agencia_inmoviliaria.Dto.InmueblesDTO;
import com.campuslands.agencia_inmoviliaria.Repositories.entities.InmuebleEntity;

@Component
public class InmueblesConverte {
    @Autowired
    private ModelMapper dbm;

    public InmuebleEntity convertirDTOInmuebleEntity(InmueblesDTO inmueblesDTO){
        return dbm.map(inmueblesDTO, InmuebleEntity.class);
    }

    public InmueblesDTO convertirInmueblesDTO(InmuebleEntity inmuebleEntity) {
        InmueblesDTO inmueblesDTO = dbm.map(inmuebleEntity, InmueblesDTO.class);
        inmueblesDTO.setIdInmueble(inmuebleEntity.getIdInmueble());
        inmueblesDTO.setIdEstadoInmueble(inmuebleEntity.getIdInmueble());
        
        // Verifica si getIdtipoInmueble() devuelve null antes de acceder a getIdTipo()
        if (inmuebleEntity.getIdtipoInmueble() != null) {
            inmueblesDTO.setIdtipoInmueble(inmuebleEntity.getIdtipoInmueble().getIdTipo());
        }
        
        inmueblesDTO.setSuperficie(inmuebleEntity.getSuperficie());
        inmueblesDTO.setDireccion(inmuebleEntity.getDireccion());
        inmueblesDTO.setNumReferencia(inmuebleEntity.getNumReferencia());
        inmueblesDTO.setIdPropietario(inmuebleEntity.getIdPropietario().getIdPropietario());
        inmueblesDTO.setNumVisitas(inmuebleEntity.getIdVisita().getNumVisitas());
    
        return inmueblesDTO;
    }
    
}
