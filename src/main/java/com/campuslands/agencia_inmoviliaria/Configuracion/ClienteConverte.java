package com.campuslands.agencia_inmoviliaria.Configuracion;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.campuslands.agencia_inmoviliaria.Dto.ClienteDTO;
import com.campuslands.agencia_inmoviliaria.Dto.DatosVisitaDTO;
import com.campuslands.agencia_inmoviliaria.Dto.PersonaDTO;
import com.campuslands.agencia_inmoviliaria.Repositories.entities.ClienteEntity;
import com.campuslands.agencia_inmoviliaria.Repositories.entities.DatosVisitaEntity;
import com.campuslands.agencia_inmoviliaria.Repositories.entities.PersonaEntity;

@Component
public class ClienteConverte {
    @Autowired
    private ModelMapper dbm;

    public ClienteEntity convertirDTOClienteEntity(ClienteDTO clienteDTO){
        return dbm.map(clienteDTO,ClienteEntity.class);
    }

    public ClienteDTO convertirClienteDTO(ClienteEntity clienteEntity){
        ClienteDTO clienteDTO = dbm.map(clienteEntity, ClienteDTO.class);

        clienteDTO.setIdCliente(clienteEntity.getIdCliente());

        if (clienteEntity.getIdCliente() != null) {
            List<PersonaDTO> datosPersona = new ArrayList<>();
            for (PersonaEntity personaEntity : clienteEntity.getIdPersona()) {
                PersonaDTO personaDTO = dbm.map(datosPersona, PersonaDTO.class);
                datosPersona.add(personaDTO); 
            }
            clienteDTO.setIdPersona(datosPersona);
        }

        if (clienteEntity.getIdDatosVisita() != null) {
            List<DatosVisitaDTO> datosVisita = new ArrayList<>();
            for (DatosVisitaEntity datosVisitaEntity : clienteEntity.getIdDatosVisita()) {
                DatosVisitaDTO datosVisitaDTO = dbm.map(datosVisita, DatosVisitaDTO.class);
                datosVisita.add(datosVisitaDTO);        
            }
            clienteDTO.setIdDatosVisita(datosVisita);
        }
        return clienteDTO;
    }
}
