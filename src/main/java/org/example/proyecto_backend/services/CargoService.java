package org.example.proyecto_backend.services;

import org.example.proyecto_backend.entities.Cargos;
import org.example.proyecto_backend.repositories.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CargoService {
    @Autowired
    private CargoRepository crepo;

    //PARA CRUD
    public List<Cargos> getAllCargos() {
        return crepo.findAll();
    }
    public Optional<Cargos> getCargoById(int id) {
        return crepo.findById(id);
    }
    public Cargos createCargo(Cargos cargo) {
        return crepo.save(cargo);
    }
    public Cargos updateCargo(int id, Cargos cargo) {
        if (crepo.existsById(id)) {
            cargo.setId(id);
            return crepo.save(cargo);
        }
        return null;
    }
    public void deleteCargo(int id) {
        crepo.deleteById(id);
    }
}
