package com.campuslands.agencia_inmoviliaria.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.campuslands.agencia_inmoviliaria.Repositories.entities.VisitasEntity;
@Repository
public interface VisitasRepository extends CrudRepository<VisitasEntity,Long>{

}
