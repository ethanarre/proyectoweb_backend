package org.example.proyecto_backend.services;

import org.example.proyecto_backend.entities.Recepcion;
import org.example.proyecto_backend.repositories.RecepcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecepcionService {
    @Autowired
    private RecepcionRepository recepcionRepository;

    public List<Recepcion> findAllRecepcion() {
        return recepcionRepository.findAll();
    }
    public Optional<Recepcion> findRecepcionById(int id) {
        return recepcionRepository.findById(id);
    }
    public Recepcion createRecepcion(Recepcion recepcion) {
        return recepcionRepository.save(recepcion);
    }
    public Recepcion updateRecepcion(int id, Recepcion recepcion) {
        if(recepcionRepository.existsById(id)) {
            recepcion.setId(id);
            return recepcionRepository.save(recepcion);
        }
        return null;
    }
    public void deleteRecepcion(int id) {
        recepcionRepository.deleteById(id);
    }
}
