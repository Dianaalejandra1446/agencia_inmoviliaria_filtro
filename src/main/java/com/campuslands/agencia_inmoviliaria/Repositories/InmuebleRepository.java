package com.campuslands.agencia_inmoviliaria.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.campuslands.agencia_inmoviliaria.Repositories.entities.InmuebleEntity;
@Repository
public interface InmuebleRepository extends CrudRepository<InmuebleEntity,Long> {
    
}
