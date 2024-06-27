package org.example.proyecto_backend.controllers;

import org.apache.coyote.Response;
import org.example.proyecto_backend.entities.Ventas;
import org.example.proyecto_backend.services.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ventas")
public class VentaController {
    @Autowired
    private VentaService ventaService;

    @GetMapping
    public List<Ventas> getAllVentas() {
        return ventaService.getAllVentas();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Ventas> getVentaById(@PathVariable int id) {
        return ventaService.getVentasById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public Ventas createVenta(@RequestBody Ventas venta) {
        return ventaService.createVenta(venta);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Ventas> updateVenta(@PathVariable int id, @RequestBody Ventas venta) {
        Ventas updatedVenta = ventaService.updateVenta(id, venta);
        if(updatedVenta != null) {
            return ResponseEntity.ok(updatedVenta);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVenta(@PathVariable int id) {
        ventaService.deleteVenta(id);
        return ResponseEntity.noContent().build();
    }
}
