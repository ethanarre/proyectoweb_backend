package org.example.proyecto_backend.controllers;

import org.example.proyecto_backend.entities.Categorias;
import org.example.proyecto_backend.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categorias> getAllCategorias(){
        return categoriaService.getAllCategorias();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Categorias> getCategoriaById(@PathVariable int id) {
        return categoriaService.getCategoriaById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public Categorias createCategoria(@RequestBody Categorias cargo) {
        return categoriaService.createCategoria(cargo);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Categorias> updateCategoria(@PathVariable int id, @RequestBody Categorias categoria) {
        Categorias updatedCargo = categoriaService.updateCategoria(id, categoria);
        if (updatedCargo != null) {
            return ResponseEntity.ok(updatedCargo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategoria(@PathVariable int id) {
        categoriaService.deleteCategoria(id);
        return ResponseEntity.noContent().build();
    }
}
