package org.example.proyecto_backend.repositories;

import org.example.proyecto_backend.entities.DetallesPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetallesPedidoRepository extends JpaRepository<DetallesPedido, Integer> {
}
