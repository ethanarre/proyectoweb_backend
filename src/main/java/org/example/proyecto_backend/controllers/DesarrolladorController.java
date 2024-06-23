package org.example.proyecto_backend.controllers;

import org.example.proyecto_backend.entities.Desarrolladores;
import org.example.proyecto_backend.repositories.DesarrolladorRepository;
import org.example.proyecto_backend.services.DesarrolladorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/desarrolladores")
public class DesarrolladorController {
    @Autowired
    private DesarrolladorService desarrolladorService;
    @Autowired
    private DesarrolladorRepository desarrolladorRepository;

    @GetMapping
    public List<Desarrolladores> getAllDesarrolladores() {
        return desarrolladorService.getAllDesarrolladores();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Desarrolladores> getDesarrolladorById(@RequestParam int id) {
        return desarrolladorService.getDesarrolladorById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public Desarrolladores createDesarrollador(@RequestBody Desarrolladores desarrollador) {
        return desarrolladorService.createDesarrollador(desarrollador);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Desarrolladores> updateDesarrollador(@PathVariable int id, @RequestBody Desarrolladores desarrollador) {
        Desarrolladores updateDesarrollador = desarrolladorService.updateDesarrollador(id, desarrollador);
        if (updateDesarrollador != null) {
            return ResponseEntity.ok(updateDesarrollador);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDesarrollador(@RequestParam int id) {
        desarrolladorService.deleteDesarrollador(id);
        return ResponseEntity.noContent().build();
    }
}
