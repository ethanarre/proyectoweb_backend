package org.example.proyecto_backend.controllers;

import org.example.proyecto_backend.entities.Estados;
import org.example.proyecto_backend.services.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/estados")
public class EstadoController {
    @Autowired
    private EstadoService estadoService;

    @GetMapping
    public List<Estados> getAllEstados(){
        return estadoService.getAllEstados();
    }
}
