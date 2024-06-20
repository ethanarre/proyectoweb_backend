package org.example.proyecto_backend.services;

import org.example.proyecto_backend.entities.Cargos;
import org.example.proyecto_backend.repositories.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoService {
    @Autowired
    private CargoRepository crepo;

    public List<Cargos> getAllCargos() {
        return crepo.findAll();
    }

    public Cargos getCargoById(int id) {
        return crepo.findById(id).get();
    }

}
