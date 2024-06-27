package org.example.proyecto_backend.services;

import org.example.proyecto_backend.entities.Pedidos;
import org.example.proyecto_backend.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedidos> getAllPedidos(){
        return pedidoRepository.findAll();
    }
    public Optional<Pedidos> getPedidosById(int id){
        return pedidoRepository.findById(id);
    }
    public Pedidos createPedido(Pedidos pedido) {
        return pedidoRepository.save(pedido);
    }
    public Pedidos updatePedido(int id, Pedidos pedido) {
        if(pedidoRepository.existsById(id)) {
            pedido.setId(id);
            return pedidoRepository.save(pedido);
        }
        return null;
    }
    public void deletePedido(int id) {
        pedidoRepository.deleteById(id);
    }
}
