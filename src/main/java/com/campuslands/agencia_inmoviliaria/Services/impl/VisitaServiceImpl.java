package com.campuslands.agencia_inmoviliaria.Services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campuslands.agencia_inmoviliaria.Repositories.VisitasRepository;
import com.campuslands.agencia_inmoviliaria.Repositories.entities.VisitasEntity;
import com.campuslands.agencia_inmoviliaria.Services.VisitasService;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class VisitaServiceImpl implements VisitasService{
    @Autowired
    private VisitasRepository visitasRepository;

    @Override
    public VisitasEntity save(VisitasEntity visitas) {
        return visitasRepository.save(visitas);
    }
    
}
