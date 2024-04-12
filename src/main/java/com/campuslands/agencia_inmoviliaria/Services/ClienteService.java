package com.campuslands.agencia_inmoviliaria.Services;


import com.campuslands.agencia_inmoviliaria.Dto.ClienteDTO;


public interface ClienteService {

    ClienteDTO findById(Long id);

    ClienteDTO save(ClienteDTO clientes);

    void delete(Long id);
    
    ClienteDTO update(Long id,ClienteDTO cliente);
}
