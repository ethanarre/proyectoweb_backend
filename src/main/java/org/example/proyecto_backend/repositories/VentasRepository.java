package org.example.proyecto_backend.repositories;

import org.example.proyecto_backend.entities.Ventas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentasRepository extends JpaRepository<Ventas, Integer> {
}
