package org.example.proyecto_backend.controllers;

import org.example.proyecto_backend.entities.Pedidos;
import org.example.proyecto_backend.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
@CrossOrigin("*")

public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public List<Pedidos> getAllPedidos(){
        return pedidoService.getAllPedidos();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Pedidos> getPedidoById(@PathVariable int id){
        return pedidoService.getPedidosById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public Pedidos createPedido(@RequestBody Pedidos pedido){
        return pedidoService.createPedido(pedido);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Pedidos> updatePedido(@PathVariable int id, @RequestBody Pedidos pedido){
        Pedidos updatePedido = pedidoService.updatePedido(id, pedido);
        if(updatePedido != null){
            return ResponseEntity.ok(updatePedido);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePedido(@PathVariable int id){
        pedidoService.deletePedido(id);
        return ResponseEntity.noContent().build();
    }
}
