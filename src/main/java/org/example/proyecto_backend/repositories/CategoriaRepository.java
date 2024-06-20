package org.example.proyecto_backend.repositories;

import org.example.proyecto_backend.entities.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categorias, Integer> {
}
