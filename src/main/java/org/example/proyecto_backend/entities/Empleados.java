package org.example.proyecto_backend.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table( name = "Empleados" )
public class Empleados{

    //Campo
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column( name = "Id")
    private int id;

    @Column( name = "Nombre" )
    private String nombre;

    @Column( name = "Apellido" )
    private String apellido;

    @ManyToOne
    @JoinColumn(name = "Id_Cargo", referencedColumnName = "Id")
    private Cargos idCargo;

    @Column( name = "Dni" )
    private String dni;

    @Column( name = "Celular" )
    private String celular;

    @Column( name = "FechaContratado" )
    private LocalDateTime fechaContratado;

    //Constructores
    public Empleados() {
    }

    public Empleados(int id, String nombre, String apellido, Cargos idCargo, String dni, String celular, LocalDateTime fechaContratado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.idCargo = idCargo;
        this.dni = dni;
        this.celular = celular;
        this.fechaContratado = fechaContratado;
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

    public Cargos getCargos() {
        return idCargo;
    }
    public void setCargos(Cargos cargo) {
        this.idCargo = cargo;
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

    public LocalDateTime getFechaContratado() {
        return fechaContratado;
    }
    public void setFechaContratado(LocalDateTime fechaContratado) {
        this.fechaContratado = fechaContratado;
    }
}
