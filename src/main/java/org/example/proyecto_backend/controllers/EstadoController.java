package org.example.proyecto_backend.controllers;

import org.example.proyecto_backend.entities.Estados;
import org.example.proyecto_backend.services.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estados")
@CrossOrigin("*")

public class EstadoController {
    @Autowired
    private EstadoService estadoService;

    @GetMapping
    public List<Estados> getAllEstados(){
        return estadoService.getAllEstados();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Estados> getEstadosById(@PathVariable int id){
        return estadoService.getEstadosById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public Estados createEstado(@RequestBody Estados estados){
        return estadoService.createEstado(estados);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Estados> updateEstado(@PathVariable int id, @RequestBody Estados estados){
        Estados updateEstado = estadoService.updateEstado(id, estados);
        if(updateEstado != null){
            return ResponseEntity.ok(updateEstado);
        }else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEstado(@PathVariable int id){
        estadoService.deleteEstado(id);
        return ResponseEntity.noContent().build();
    }
}
