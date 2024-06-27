package org.example.proyecto_backend.services;

import org.example.proyecto_backend.entities.Ventas;
import org.example.proyecto_backend.repositories.VentasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VentaService {
    @Autowired
    private VentasRepository ventasRepository;

    public List<Ventas> getAllVentas() {
        return ventasRepository.findAll();
    }
    public Optional<Ventas> getVentasById(int id) {
        return ventasRepository.findById(id);
    }
    public Ventas createVenta(Ventas venta) {
        return ventasRepository.save(venta);
    }
    public Ventas updateVenta(int id, Ventas venta) {
        if(ventasRepository.existsById(id)) {
            venta.setId(id);
            return ventasRepository.save(venta);
        }
        return null;
    }
    public void deleteVenta(int id) {
        ventasRepository.deleteById(id);
    }
}
