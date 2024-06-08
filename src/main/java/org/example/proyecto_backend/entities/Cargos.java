package org.example.proyecto_backend.entities;

import jakarta.persistence.*;

@Entity
@Table( name = "Cargos" )
public class Cargos {

    //Campos
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    @Column( name = "Id" )
    private int id;

    @Column( name = "Nombre" )
    private String nombre;


    //Constructores
    public Cargos() {
    }
    public Cargos(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    //Getter and Setters
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
