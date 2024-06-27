package org.example.proyecto_backend.services;

import org.example.proyecto_backend.entities.Empleados;
import org.example.proyecto_backend.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {
    @Autowired
    private EmpleadoRepository empleadoRepository;

    public List<Empleados> getAllEmpleados() {
        return empleadoRepository.findAll();
    }
    public Optional<Empleados> getEmpleadoById(int id) {
        return empleadoRepository.findById(id);
    }
    public Empleados createEmpleado(Empleados empleado) {
        return empleadoRepository.save(empleado);
    }
    public Empleados updateEmpleado(int id, Empleados empleado) {
        if(empleadoRepository.existsById(id)) {
            empleado.setId(id);
            return empleadoRepository.save(empleado);
        }
        return null;
    }
    public void deleteEmpleado(int id) {
        empleadoRepository.deleteById(id);
    }

    public Optional<Empleados> getEmpleadoByEmail(String email) {
        return empleadoRepository.findByEmail(email);
    }

}
