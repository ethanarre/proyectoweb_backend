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

    @Column( name = "Email")
    private String email;

    @Column( name = "Contrasena")
    private String contrasena;

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

    public Empleados(int id, String nombre, String apellido, String email, String contrasena, Cargos idCargo, String dni, String celular, LocalDateTime fechaContratado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.contrasena = contrasena;
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

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Cargos getIdCargo() {
        return idCargo;
    }
    public void setIdCargo(Cargos idCargo) {
        this.idCargo = idCargo;
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

    @PrePersist
    protected void onCreate() {
        this.fechaContratado = LocalDateTime.now();
    }
}
