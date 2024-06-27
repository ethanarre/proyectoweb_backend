package org.example.proyecto_backend.controllers;

import org.example.proyecto_backend.entities.Videojuegos;
import org.example.proyecto_backend.services.VideojuegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/videojuegos")
@CrossOrigin("*")

public class VideojuegoController {
    @Autowired
    private VideojuegoService videojuegoService;

    @GetMapping
    public List<Videojuegos> getAllVideojuegos() {
        return videojuegoService.getAllVideojuegos();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Videojuegos> getVideojuegoById(@PathVariable int id) {
        return videojuegoService.getVideojuegoById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public Videojuegos createVideojuego(@RequestBody Videojuegos videojuego) {
        return videojuegoService.createVideojuego(videojuego);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Videojuegos> updateVideojuego(@PathVariable int id, @RequestBody Videojuegos videojuego) {
        Videojuegos updateVideojuegos = videojuegoService.updateVideojuego(id, videojuego);
        if(updateVideojuegos != null) {
            return ResponseEntity.ok(updateVideojuegos);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVideojuego(@PathVariable int id) {
        videojuegoService.deleteVideojuego(id);
        return ResponseEntity.noContent().build();
    }
}
