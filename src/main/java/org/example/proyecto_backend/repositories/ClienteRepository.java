package org.example.proyecto_backend.repositories;

import org.example.proyecto_backend.entities.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Clientes, Integer> {
}
