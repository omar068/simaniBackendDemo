package com.backend.controllers;

import com.backend.entities.MovilidadEntrante;
import com.backend.services.MovilidadEntranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/movilidad")
public class MovilidadEntranteController {

    @Autowired
    MovilidadEntranteService service;

    @GetMapping
    public List<MovilidadEntrante> list(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> view(@PathVariable Long id){
        Optional<MovilidadEntrante> movilidadEntranteOptional = service.findByIdEmpleados(id);
        if(movilidadEntranteOptional.isPresent()){
            return ResponseEntity.ok(movilidadEntranteOptional.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<MovilidadEntrante> create(@RequestBody MovilidadEntrante movilidadEntrante){
        MovilidadEntrante movilidadNew = service.save(movilidadEntrante);
        return ResponseEntity.status(HttpStatus.CREATED).body(movilidadNew);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MovilidadEntrante> update(@PathVariable Long id, @RequestBody MovilidadEntrante movilidadEntrante){
        movilidadEntrante.setIdEmpleados(id);
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(movilidadEntrante));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        MovilidadEntrante movilidadEntrante = new MovilidadEntrante();
        movilidadEntrante.setIdEmpleados(id);
        Optional<MovilidadEntrante> movilidadEntranteOptional = service.delete(movilidadEntrante);
        if(movilidadEntranteOptional.isPresent()){
            return ResponseEntity.ok(movilidadEntranteOptional.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }
}
