package com.campuslands.agencia_inmoviliaria.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campuslands.agencia_inmoviliaria.Dto.InmueblesDTO;
import com.campuslands.agencia_inmoviliaria.Services.InmuebleService;

@RestController
@RequestMapping("inmueble")
public class InmuebleController {
    @Autowired
    private InmuebleService inmuebleService;

    @GetMapping("/ver-inmuebles")
    public List<InmueblesDTO> findAll(){
        return inmuebleService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<InmueblesDTO> findById(@PathVariable Long id) {
        InmueblesDTO inmueble = inmuebleService.findById(id);
        if (inmueble != null) {
            return new ResponseEntity<>(inmueble, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

     @PostMapping("/agregar-inmueble")
    public InmueblesDTO save(@RequestBody  InmueblesDTO inmueble){
        return inmuebleService.save(inmueble);
    }
    
     @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        try {
            inmuebleService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception ex) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
   

}
