package org.example.proyecto_backend.entities;

import jakarta.persistence.*;

@Entity
@Table( name = "Plataformas" )
public class Plataformas {
    //Campo
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "Id" )
    private int id;

    @Column( name = "Nombre" )
    private String nombre;

    //Contructores
    public Plataformas() {
    }
    public Plataformas(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
