package org.example.proyecto_backend.controllers;

import org.example.proyecto_backend.entities.DetallesPedido;
import org.example.proyecto_backend.services.DetallesPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detallespedidos")
@CrossOrigin("*")

public class DetallesPedidoController {
    @Autowired
    private DetallesPedidoService detallesPedidoService;

    @GetMapping
    public List<DetallesPedido> getAllDetallesPedido(){
        return detallesPedidoService.getAllDetallesPedido();
    }
    @GetMapping("/{id}")
    public ResponseEntity<DetallesPedido> getDetallesPedidoById(@PathVariable int id) {
        return detallesPedidoService.getDetallesPedidoById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public DetallesPedido createDetallesPedido(@RequestBody DetallesPedido detallesPedido) {
        return detallesPedidoService.createDetallesPedido(detallesPedido);
    }
    @PutMapping("/{id}")
    public ResponseEntity<DetallesPedido> updateDetallesPedido(@PathVariable int id, @RequestBody DetallesPedido detallesPedido) {
        DetallesPedido updatedDetallesPedido = detallesPedidoService.updateDetallesPedido(id, detallesPedido);
        if (updatedDetallesPedido != null) {
            return ResponseEntity.ok(updatedDetallesPedido);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDetallesPedido(@PathVariable int id) {
        detallesPedidoService.deleteDetallesPedido(id);
        return ResponseEntity.noContent().build();
    }
}
