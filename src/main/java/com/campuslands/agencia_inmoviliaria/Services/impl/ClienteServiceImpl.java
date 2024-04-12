package com.campuslands.agencia_inmoviliaria.Services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.campuslands.agencia_inmoviliaria.Configuracion.ClienteConverte;
import com.campuslands.agencia_inmoviliaria.Dto.ClienteDTO;
import com.campuslands.agencia_inmoviliaria.Repositories.ClienteRepository;
import com.campuslands.agencia_inmoviliaria.Repositories.entities.ClienteEntity;
import com.campuslands.agencia_inmoviliaria.Services.ClienteService;

public class ClienteServiceImpl implements ClienteService{
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ClienteConverte clienteConverte;

    @Override
    @Transactional(readOnly = true)
    public ClienteDTO findById(Long id) {
        Optional<ClienteEntity> cuotaOptional = clienteRepository.findById(id);
        if (cuotaOptional.isPresent()) {
            ClienteEntity clienteEntity = cuotaOptional.get();
            return clienteConverte.convertirClienteDTO(clienteEntity);
        }
        return null;        
    }

    @Override
    @Transactional
    public ClienteDTO save(ClienteDTO clientes) {
        ClienteEntity clienteEntity = clienteConverte.convertirDTOClienteEntity(clientes);
        clienteRepository.save(clienteEntity);
        // Conversion a DTO
        return clienteConverte.convertirClienteDTO(clienteEntity);
    }

    @Override
    public void delete(Long id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public ClienteDTO update(Long id, ClienteDTO cliente) {
        Optional<ClienteEntity> clienteCurrentOptional = clienteRepository.findById(id);
        if (clienteCurrentOptional.isPresent()) {
            
            ClienteEntity clienteCurrent = clienteConverte.convertirDTOClienteEntity(cliente);
            clienteCurrent.setIdCliente(id);
            clienteCurrent.setIdDatosVisita(clienteCurrent.getIdDatosVisita());
            clienteCurrent.setIdPersona(clienteCurrent.getIdPersona());

            clienteRepository.save(clienteCurrent);

            return clienteConverte.convertirClienteDTO(clienteCurrent);
        }
        return null;
    }
    
}
