package org.example.proyecto_backend.controllers;

import org.example.proyecto_backend.entities.Recepcion;
import org.example.proyecto_backend.services.RecepcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recepciones")
public class RecepcionController {
    @Autowired
    private RecepcionService recepcionService;

    @GetMapping
    public List<Recepcion> findAllRecepcion() {
        return recepcionService.findAllRecepcion();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Recepcion> findRecepcionById(@PathVariable int id) {
        return recepcionService.findRecepcionById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public Recepcion createRecepcion(@RequestBody Recepcion recepcion) {
        return recepcionService.createRecepcion(recepcion);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Recepcion> updateRecepcion(@PathVariable int id, @RequestBody Recepcion recepcion) {
        Recepcion updatedRecepcion = recepcionService.updateRecepcion(id, recepcion);
        if(updatedRecepcion != null) {
            return ResponseEntity.ok(updatedRecepcion);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecepcion(@PathVariable int id) {
        recepcionService.deleteRecepcion(id);
        return ResponseEntity.noContent().build();
    }
}
