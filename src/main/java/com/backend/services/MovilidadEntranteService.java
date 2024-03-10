package com.backend.services;

import com.backend.entities.MovilidadEntrante;

import java.util.List;
import java.util.Optional;

public interface MovilidadEntranteService {

    List<MovilidadEntrante> findAll();

    Optional<MovilidadEntrante> findByIdEmpleados(Long idEmpleados);

    MovilidadEntrante save(MovilidadEntrante movilidadEntrante);

    Optional<MovilidadEntrante> delete(MovilidadEntrante movilidadEntrante);
}
