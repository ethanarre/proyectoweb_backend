package org.example.proyecto_backend.entities;

import jakarta.persistence.*;

@Entity
@Table( name = "Clientes" )
public class Clientes {
    //Campos
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column( name = "Id ")
    private int id;

    @Column( name = "Nombre" )
    private String nombre;

    @Column( name = "Apellido" )
    private String apellido;

    @Column( name = "Dni" )
    private String dni;

    @Column( name = "Celular" )
    private String celular;

    @Column( name = "Email" )
    private String email;

    //Constructores
    public Clientes() {
    }
    public Clientes(int id, String nombre, String apellido, String dni, String celular, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.celular = celular;
        this.email = email;
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

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
