package org.example.proyecto_backend.services;

import org.example.proyecto_backend.entities.Plataformas;
import org.example.proyecto_backend.repositories.PlataformaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlataformaService {
    @Autowired
    private PlataformaRepository plataformaRepository;

    public List<Plataformas> getAllPlataformas() {
        return plataformaRepository.findAll();
    }
    public Optional<Plataformas> getPlataformasById(int id) {
        return plataformaRepository.findById(id);
    }
    public Plataformas createPlataformas(Plataformas plataformas) {
        return plataformaRepository.save(plataformas);
    }
    public Plataformas updatePlataformas(int id, Plataformas plataformas) {
        if(plataformaRepository.existsById(id)) {
            return plataformaRepository.save(plataformas);
        }
        return null;
    }
    public void deletePlataformas(int id) {
        plataformaRepository.deleteById(id);
    }

}
