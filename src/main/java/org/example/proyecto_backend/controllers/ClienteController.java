package org.example.proyecto_backend.controllers;

import org.example.proyecto_backend.entities.Clientes;
import org.example.proyecto_backend.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Clientes> getAllClientes() {
        return clienteService.getAllClientes();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Clientes> getClienteById(@PathVariable int id) {
        return clienteService.getClienteById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public Clientes createCliente(@RequestBody Clientes cliente) {
        return clienteService.createCliente(cliente);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Clientes> updateCliente(@PathVariable int id, @RequestBody Clientes cliente) {
        Clientes updateCliente = clienteService.updateCliente(id, cliente);
        if (updateCliente != null) {
            return ResponseEntity.ok(updateCliente);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable int id) {
        clienteService.deleteCliente(id);
        return ResponseEntity.noContent().build();
    }

}
