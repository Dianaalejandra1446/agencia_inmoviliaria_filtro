package com.campuslands.agencia_inmoviliaria.Configuracion;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.campuslands.agencia_inmoviliaria.Dto.PersonaDTO;
import com.campuslands.agencia_inmoviliaria.Repositories.entities.PersonaEntity;

@Component
public class PersonaConverte {
    @Autowired
    private ModelMapper dbm;
    
    public PersonaEntity convertirDTOPersonaEntity(PersonaDTO personaDTO){
        return dbm.map(personaDTO, PersonaEntity.class);
    }

    public PersonaDTO convertiPersonaDTO(PersonaEntity personaEntity){
        PersonaDTO personaDTO = dbm.map(personaEntity, PersonaDTO.class);
        personaDTO.setIdPersona(personaEntity.getIdPersona());
        personaDTO.setNombre(personaEntity.getNombre());
        personaDTO.setTelefono(personaEntity.getTelefono());

        return personaDTO;
    }
}
