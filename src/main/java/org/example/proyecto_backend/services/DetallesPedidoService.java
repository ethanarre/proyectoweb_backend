package org.example.proyecto_backend.services;

import org.example.proyecto_backend.entities.DetallesPedido;
import org.example.proyecto_backend.repositories.DetallesPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetallesPedidoService {
    @Autowired
    private DetallesPedidoRepository detallesPedidoRepository;

    public List<DetallesPedido> getAllDetallesPedido() {
        return detallesPedidoRepository.findAll();
    }
    public Optional<DetallesPedido> getDetallesPedidoById(int id) {
        return detallesPedidoRepository.findById(id);
    }
    public DetallesPedido createDetallesPedido( DetallesPedido detallesPedido) {
        return detallesPedidoRepository.save(detallesPedido);
    }
    public DetallesPedido updateDetallesPedido(int id, DetallesPedido detallesPedido) {
        if (detallesPedidoRepository.existsById(id)) {
            detallesPedido.setId(id);
            return detallesPedidoRepository.save(detallesPedido);
        }
        return null;
    }
    public void deleteDetallesPedido(int id) {
        detallesPedidoRepository.deleteById(id);
    }

}
