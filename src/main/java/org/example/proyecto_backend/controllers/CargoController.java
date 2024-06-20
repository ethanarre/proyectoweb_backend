package org.example.proyecto_backend.controllers;

import org.example.proyecto_backend.entities.Cargos;
import org.example.proyecto_backend.services.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cargos")
public class CargoController {
    @Autowired
    private CargoService cargoService;

    @GetMapping
    public  List<Cargos> getAllCargos(){
        return cargoService.getAllCargos();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Cargos> getCargoById(@PathVariable int id) {
        return cargoService.getCargoById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public Cargos createCargo(@RequestBody Cargos cargo) {
        return cargoService.createCargo(cargo);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Cargos> updateCargo(@PathVariable int id, @RequestBody Cargos cargo) {
        Cargos updatedCargo = cargoService.updateCargo(id, cargo);
        if (updatedCargo != null) {
            return ResponseEntity.ok(updatedCargo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCargo(@PathVariable int id) {
        cargoService.deleteCargo(id);
        return ResponseEntity.noContent().build();
    }
}
