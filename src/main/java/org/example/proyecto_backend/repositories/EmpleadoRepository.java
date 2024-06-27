package org.example.proyecto_backend.repositories;

import org.example.proyecto_backend.entities.Empleados;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmpleadoRepository extends JpaRepository<Empleados, Integer> {
Optional<Empleados> findByEmail(String email);
}
