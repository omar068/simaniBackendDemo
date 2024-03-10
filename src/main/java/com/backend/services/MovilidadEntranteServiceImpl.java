package com.backend.services;

import com.backend.entities.MovilidadEntrante;
import com.backend.repositories.MovilidadEntranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class MovilidadEntranteServiceImpl implements MovilidadEntranteService{

    @Autowired
    MovilidadEntranteRepository movilidadEntranteRepository;

    @Transactional(readOnly = true)
    @Override
    public List<MovilidadEntrante> findAll() {
        return (List<MovilidadEntrante>) movilidadEntranteRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<MovilidadEntrante> findByIdEmpleados(Long idEmpleados) {
        return movilidadEntranteRepository.findById(idEmpleados);
    }

    @Transactional
    @Override
    public MovilidadEntrante save(MovilidadEntrante movilidadEntrante) {
        return movilidadEntranteRepository.save(movilidadEntrante);
    }

    @Transactional
    @Override
    public Optional<MovilidadEntrante> delete(MovilidadEntrante movilidadEntrante) {
        Optional<MovilidadEntrante> movilidadEntranteOptional = movilidadEntranteRepository.findById(movilidadEntrante.getIdEmpleados());
        movilidadEntranteOptional.ifPresent(movidb ->{
            movilidadEntranteRepository.delete(movidb);
                });
        return movilidadEntranteOptional;


    }
}
