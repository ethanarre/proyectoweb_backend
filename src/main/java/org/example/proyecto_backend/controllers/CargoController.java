package org.example.proyecto_backend.controllers;

import org.example.proyecto_backend.entities.Cargos;
import org.example.proyecto_backend.services.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
