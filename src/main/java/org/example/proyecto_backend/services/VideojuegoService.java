package org.example.proyecto_backend.services;

import org.example.proyecto_backend.entities.Videojuegos;
import org.example.proyecto_backend.repositories.VideojuegosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VideojuegoService {
    @Autowired
    private VideojuegosRepository videojuegosRepository;

    public List<Videojuegos> getAllVideojuegos() {
        return videojuegosRepository.findAll();
    }
    public Optional<Videojuegos> getVideojuegoById(int id) {
        return videojuegosRepository.findById(id);
    }
    public Videojuegos createVideojuego(Videojuegos videojuego) {
        return videojuegosRepository.save(videojuego);
    }
    public Videojuegos updateVideojuego(int id, Videojuegos videojuego) {
        if( videojuegosRepository.existsById(id)) {
            videojuego.setId(id);
            return videojuegosRepository.save(videojuego);
        }
        return null;
    }
    public void deleteVideojuego(int id) {
        videojuegosRepository.deleteById(id);
    }
}
