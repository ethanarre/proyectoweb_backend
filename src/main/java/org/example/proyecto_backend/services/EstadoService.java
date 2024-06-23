package org.example.proyecto_backend.services;

import org.example.proyecto_backend.entities.Estados;
import org.example.proyecto_backend.repositories.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {
    @Autowired
    private EstadoRepository estadoRepository;

    public List<Estados> getAllEstados(){
        return estadoRepository.findAll();
    }
    public Optional<Estados> getEstadosById(int id){
        return estadoRepository.findById(id);
    }
    public Estados createEstado(Estados estado){
        return estadoRepository.save(estado);
    }
    public Estados updateEstado(int id, Estados estado){
        if(estadoRepository.existsById(id)){
            estado.setId(id);
            return estadoRepository.save(estado);
        }
        return null;
    }
    public void deleteEstado(int id){
        estadoRepository.deleteById(id);
    }
}
