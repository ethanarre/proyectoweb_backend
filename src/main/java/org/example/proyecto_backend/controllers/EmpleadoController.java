package org.example.proyecto_backend.controllers;

import org.example.proyecto_backend.entities.Empleados;
import org.example.proyecto_backend.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empleados")
@CrossOrigin("*")

public class EmpleadoController {
    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping
    public List<Empleados> getAllEmpleados() {
        return empleadoService.getAllEmpleados();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Empleados> getEmpleadoById(@PathVariable int id) {
        return empleadoService.getEmpleadoById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public Empleados createEmpleado(@RequestBody Empleados empleado) {
        return empleadoService.createEmpleado(empleado);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Empleados> updateEmpleado(@PathVariable int id, @RequestBody Empleados empleado) {
        Empleados updateEmpleado = empleadoService.updateEmpleado(id, empleado);
        if(updateEmpleado != null) {
            return ResponseEntity.ok(updateEmpleado);
        }else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmpleado(@PathVariable int id) {
        empleadoService.deleteEmpleado(id);
        return ResponseEntity.noContent().build();
    }
}
