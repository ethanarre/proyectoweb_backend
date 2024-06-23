package org.example.proyecto_backend.services;

import org.example.proyecto_backend.entities.Categorias;
import org.example.proyecto_backend.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    //PARA CRUD
    public List<Categorias> getAllCategorias() {
        return categoriaRepository.findAll();
    }
    public Optional<Categorias> getCategoriaById(int id) {
        return categoriaRepository.findById(id);
    }
    public Categorias createCategoria(Categorias cargo) {
        return categoriaRepository.save(cargo);
    }
    public Categorias updateCategoria(int id, Categorias categoria) {
        if (categoriaRepository.existsById(id)) {
            categoria.setId(id);
            return categoriaRepository.save(categoria);
        }
        return null;
    }
    public void deleteCategoria(int id) {
        categoriaRepository.deleteById(id);
    }
}
