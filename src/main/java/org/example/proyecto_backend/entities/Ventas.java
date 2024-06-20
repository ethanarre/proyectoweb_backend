package org.example.proyecto_backend.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table( name = "Ventas")
public class Ventas {
    //Campos
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column( name = "Id" )
    private int id;

    @OneToOne
    @JoinColumn( name = "Id_Pedido", referencedColumnName = "Id")
    private Pedidos idPedido;

    @Column( name = "FechaVenta")
    private LocalDateTime fechaVenta;

    @Column( name = "TotalPagar")
    private double totalPagar;

    @ManyToOne
    @JoinColumn( name = "Id_TipoPago", referencedColumnName = "Id")
    private TipoPago idTipoPago;

    //Constructor
    public Ventas() {}
    public Ventas(int id, Pedidos idPedido, LocalDateTime fechaVenta, double totalPagar, TipoPago idTipoPago) {
        this.id = id;
        this.idPedido = idPedido;
        this.fechaVenta = fechaVenta;
        this.totalPagar = totalPagar;
        this.idTipoPago = idTipoPago;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Pedidos getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(Pedidos idPedido) {
        this.idPedido = idPedido;
    }

    public LocalDateTime getFechaVenta() {
        return fechaVenta;
    }
    public void setFechaVenta(LocalDateTime fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getTotalPagar() {
        return totalPagar;
    }
    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public TipoPago getIdTipoPago() {
        return idTipoPago;
    }
    public void setIdTipoPago(TipoPago idTipoPago) {
        this.idTipoPago = idTipoPago;
    }
}
