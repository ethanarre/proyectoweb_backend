package org.example.proyecto_backend.repositories;

import org.example.proyecto_backend.entities.Videojuegos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideojuegosRepository extends JpaRepository<Videojuegos, Integer> {
}
