package org.example.proyecto_backend.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table( name = "Pedidos")
public class Pedidos {
    //Campos
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    @Column( name = "Id" )
    private int id;

    @Column( name = "FechaPedido" )
    private LocalDateTime fechaPedido;

    @ManyToOne
    @JoinColumn( name = "Id_Empleado", referencedColumnName = "Id")
    private Empleados idEmpleado;

    @ManyToOne
    @JoinColumn( name = "Id_Cliente", referencedColumnName = "Id")
    private Clientes idCliente;

    @ManyToOne
    @JoinColumn( name = "Id_Estado", referencedColumnName = "Id")
    private Estados idEstado;

    //Constructores
    public Pedidos() {}
    public Pedidos(int id, LocalDateTime fechaPedido, Empleados idEmpleado, Clientes idCliente, Estados idEstado) {
        this.id = id;
        this.fechaPedido = fechaPedido;
        this.idEmpleado = idEmpleado;
        this.idCliente = idCliente;
        this.idEstado = idEstado;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getFechaPedido() {
        return fechaPedido;
    }
    public void setFechaPedido(LocalDateTime fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Empleados getIdEmpleado() {
        return idEmpleado;
    }
    public void setIdEmpleado(Empleados idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Clientes getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(Clientes idCliente) {
        this.idCliente = idCliente;
    }

    public Estados getIdEstado() {
        return idEstado;
    }
    public void setIdEstado(Estados idEstado) {
        this.idEstado = idEstado;
    }
}
