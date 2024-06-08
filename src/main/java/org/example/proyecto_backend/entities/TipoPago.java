package org.example.proyecto_backend.entities;

import jakarta.persistence.*;

@Entity
@Table( name = "TipoPago" )
public class TipoPago {
    //Campo
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column( name = "Id" )
    private int id;

    @Column( name = "TipodePago")
    private String tipodePago;

    //Constructor
    public TipoPago() {}
    public TipoPago(int id, String tipodePago) {
        this.id = id;
        this.tipodePago = tipodePago;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTipodePago() {
        return tipodePago;
    }
    public void setTipodePago(String tipodePago) {
        this.tipodePago = tipodePago;
    }
}
