package com.campuslands.agencia_inmoviliaria.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campuslands.agencia_inmoviliaria.Repositories.entities.VisitasEntity;
import com.campuslands.agencia_inmoviliaria.Services.VisitasService;

@RestController
@RequestMapping("/visitas")
public class VisitasController {
    @Autowired
    private VisitasService visitasService;

     @PostMapping("/agregar-visitas")
    public VisitasEntity save(@RequestBody  VisitasEntity visitas){
        return visitasService.save(visitas);
    }    
}
