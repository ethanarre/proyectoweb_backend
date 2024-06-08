package org.example.proyecto_backend.entities;

import jakarta.persistence.*;

@Entity
@Table( name = "DetallesPedido" )
public class DetallesPedido {
    //Campo
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column( name = "Id" )
    private int id;

    @ManyToOne
    @JoinColumn( name = "Id_Videojuegos", referencedColumnName = "Id")
    private Videojuegos idVideojuegos;

    @Column( name = "Cantidad" )
    private int cantidad;

    @Column( name = "Precio" )
    private double precio;

    @ManyToOne
    @JoinColumn( name = "Id_Pedidos", referencedColumnName = "Id")
    private Pedidos idPedidos;

    //Constructor
    public DetallesPedido() {}
    public DetallesPedido(int id, Videojuegos idVideojuegos, int cantidad, double precio, Pedidos idPedidos) {
        this.id = id;
        this.idVideojuegos = idVideojuegos;
        this.cantidad = cantidad;
        this.precio = precio;
        this.idPedidos = idPedidos;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Videojuegos getIdVideojuegos() {
        return idVideojuegos;
    }
    public void setIdVideojuegos(Videojuegos idVideojuegos) {
        this.idVideojuegos = idVideojuegos;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Pedidos getIdPedidos() {
        return idPedidos;
    }
    public void setIdPedidos(Pedidos idPedidos) {
        this.idPedidos = idPedidos;
    }
}
