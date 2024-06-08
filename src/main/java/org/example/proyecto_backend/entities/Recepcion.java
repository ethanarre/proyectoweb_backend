package org.example.proyecto_backend.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table( name = "Recepcion")
public class Recepcion {
    //Campos
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "Id" )
    private int id;

    @ManyToOne
    @JoinColumn( name = "Id_Videojuegos", referencedColumnName = "Id")
    private Videojuegos videojuegos;

    @Column( name = "FechaRecepcion" )
    private LocalDateTime fechaRecepcion;

    @Column( name = "Cantidad" )
    private int cantidad;

    //Constructores
    public Recepcion() {
    }
    public Recepcion(int id, Videojuegos videojuegos, LocalDateTime fechaRecepcion, int cantidad) {
        this.id = id;
        this.videojuegos = videojuegos;
        this.fechaRecepcion = fechaRecepcion;
        this.cantidad = cantidad;
    }

    //Getters and Setters

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Videojuegos getVideojuegos() {
        return videojuegos;
    }
    public void setVideojuegos(Videojuegos videojuegos) {
        this.videojuegos = videojuegos;
    }

    public LocalDateTime getFechaRecepcion() {
        return fechaRecepcion;
    }
    public void setFechaRecepcion(LocalDateTime fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
