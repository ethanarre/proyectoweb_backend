package org.example.proyecto_backend.entities;

import jakarta.persistence.*;

@Entity
@Table ( name = "Categorias" )  
public class Categorias {
    //Campos
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY )
    @Column( name = "Id" )
    private int id;

    @Column( name = "Nombre" )
    private String nombre;

    @Column( name = "Descripcion" )
    private String descripcion;

    //Constructores
    public Categorias() {
    }
    public Categorias(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
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

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
