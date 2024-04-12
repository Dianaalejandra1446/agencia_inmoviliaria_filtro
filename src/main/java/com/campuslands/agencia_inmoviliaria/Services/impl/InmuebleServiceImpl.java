package com.campuslands.agencia_inmoviliaria.Services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.campuslands.agencia_inmoviliaria.Configuracion.InmueblesConverte;
import com.campuslands.agencia_inmoviliaria.Dto.InmueblesDTO;
import com.campuslands.agencia_inmoviliaria.Repositories.InmuebleRepository;
import com.campuslands.agencia_inmoviliaria.Repositories.entities.InmuebleEntity;
import com.campuslands.agencia_inmoviliaria.Services.InmuebleService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class InmuebleServiceImpl implements InmuebleService{
    @Autowired
    private InmuebleRepository inmuebleRepository;
    @Autowired
    private InmueblesConverte inmueblesConverte;

    @Override
    @Transactional(readOnly = true)
    public List<InmueblesDTO> findAll() {
        List<InmuebleEntity> inmuebles = (List<InmuebleEntity>) inmuebleRepository.findAll();
        return inmuebles.stream()
                       .map(inmueble -> inmueblesConverte.convertirInmueblesDTO(inmueble))
                       .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public InmueblesDTO findById(Long id) {
        Optional<InmuebleEntity> inmuebleOptional = inmuebleRepository.findById(id);
        if (inmuebleOptional.isPresent()) {
            InmuebleEntity inmuebleEntity = inmuebleOptional.get();
            return inmueblesConverte.convertirInmueblesDTO(inmuebleEntity);
        }
        return null; // O puedes lanzar una excepción de recurso no encontrado aquí
    }

    @Override
    public InmueblesDTO save(InmueblesDTO inmuebles) {
        InmuebleEntity inmueble = inmueblesConverte.convertirDTOInmuebleEntity(inmuebles);
        inmuebleRepository.save(inmueble);
        return inmueblesConverte.convertirInmueblesDTO(inmueble);
    }

    @Override
    public void delete(Long id) {
        inmuebleRepository.deleteById(id);
    }
    
}
