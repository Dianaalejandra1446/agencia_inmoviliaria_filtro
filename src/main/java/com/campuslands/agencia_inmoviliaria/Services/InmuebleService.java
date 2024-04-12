package com.campuslands.agencia_inmoviliaria.Services;

import java.util.List;

import com.campuslands.agencia_inmoviliaria.Dto.InmueblesDTO;

public interface InmuebleService {
    List<InmueblesDTO> findAll();

    InmueblesDTO findById(Long id);

    InmueblesDTO save(InmueblesDTO inmuebles);

    void delete(Long id);
}
