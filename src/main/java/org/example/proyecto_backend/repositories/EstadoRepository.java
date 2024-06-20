package org.example.proyecto_backend.repositories;

import org.example.proyecto_backend.entities.Estados;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepository extends JpaRepository<Estados, Integer> {
}
