package org.example.proyecto_backend.repositories;

import org.example.proyecto_backend.entities.Plataformas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlataformaRepository extends JpaRepository<Plataformas, Integer> {
}
