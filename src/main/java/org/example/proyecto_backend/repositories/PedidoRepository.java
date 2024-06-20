package org.example.proyecto_backend.repositories;

import org.example.proyecto_backend.entities.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedidos, Integer> {
}
