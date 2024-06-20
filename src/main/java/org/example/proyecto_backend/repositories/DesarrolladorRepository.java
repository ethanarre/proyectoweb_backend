package org.example.proyecto_backend.repositories;

import org.example.proyecto_backend.entities.Desarrolladores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesarrolladorRepository extends JpaRepository<Desarrolladores, Integer> {
}
