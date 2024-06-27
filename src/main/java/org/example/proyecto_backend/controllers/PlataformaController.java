package org.example.proyecto_backend.controllers;

import org.example.proyecto_backend.entities.Plataformas;
import org.example.proyecto_backend.services.PlataformaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/plataformas")
public class PlataformaController {
    @Autowired
    private PlataformaService plataformaService;

    @GetMapping
    public List<Plataformas> getAllPlataformas() {
        return plataformaService.getAllPlataformas();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Plataformas> getPlataformasById(@PathVariable int id) {
        return plataformaService.getPlataformasById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public Plataformas createPlataformas(@RequestBody Plataformas plataformas) {
        return plataformaService.createPlataformas(plataformas);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Plataformas> updatePlataformas(@PathVariable int id, @RequestBody Plataformas plataformas) {
        Plataformas updatePlataforma = plataformaService.updatePlataformas(id, plataformas);
        if( updatePlataforma != null ) {
            return ResponseEntity.ok(updatePlataforma);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlataformas(@PathVariable int id) {
        plataformaService.deletePlataformas(id);
        return ResponseEntity.noContent().build();
    }
}
