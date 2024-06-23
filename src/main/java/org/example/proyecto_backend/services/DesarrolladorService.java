package org.example.proyecto_backend.services;

import org.example.proyecto_backend.entities.Desarrolladores;
import org.example.proyecto_backend.repositories.DesarrolladorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DesarrolladorService {
    @Autowired
    private DesarrolladorRepository desarrolladorRepository;

    public List<Desarrolladores> getAllDesarrolladores() {
        return desarrolladorRepository.findAll();
    }
    public Optional<Desarrolladores> getDesarrolladorById(int id) {
        return desarrolladorRepository.findById(id);
    }
    public Desarrolladores createDesarrollador(Desarrolladores desarrollador) {
        return desarrolladorRepository.save(desarrollador);
    }
    public Desarrolladores updateDesarrollador(int id, Desarrolladores desarrollador) {
        if(desarrolladorRepository.existsById(id)) {
            desarrollador.setId(id);
            return desarrolladorRepository.save(desarrollador);
        }
        return null;
    }
    public void deleteDesarrollador(int id) {
        desarrolladorRepository.deleteById(id);
    }
}
