package org.example.proyecto_backend.services;

import org.example.proyecto_backend.entities.Clientes;
import org.example.proyecto_backend.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    //PARA CRUD
    public List<Clientes> getAllClientes() {
        return clienteRepository.findAll();
    }
    public Optional<Clientes> getClienteById(int id) {
        return clienteRepository.findById(id);
    }
    public Clientes createCliente(Clientes cliente) {
        return clienteRepository.save(cliente);
    }
    public Clientes updateCliente(int id, Clientes cliente) {
        if (clienteRepository.existsById(id)) {
            cliente.setId(id);
            return clienteRepository.save(cliente);
        }
        return null;
    }
    public void deleteCliente(int id) {
        clienteRepository.deleteById(id);
    }
}
