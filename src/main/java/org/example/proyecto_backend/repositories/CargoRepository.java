package org.example.proyecto_backend.repositories;

import org.example.proyecto_backend.entities.Cargos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoRepository extends JpaRepository<Cargos, Integer> {
}
