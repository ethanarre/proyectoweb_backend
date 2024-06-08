package org.example.proyecto_backend.entities;

import jakarta.persistence.*;

@Entity
@Table( name = "Estados")
public class Estados {
    //Campos
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    @Column( name = "Id" )
    private int id;

    @Column( name = "Nombre" )
    private String nombre;

    //Constructores
    public Estados() {}
    public Estados(int id, String nombre) {
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
