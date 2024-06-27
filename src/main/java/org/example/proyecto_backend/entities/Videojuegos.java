package org.example.proyecto_backend.entities;

import jakarta.persistence.*;

@Entity
@Table( name = "Videojuegos" )
public class Videojuegos {
    //Campos
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column( name = "Id")
    private int id;

    @Column( name = "Nombre" )
    private String nombre;

    @Lob
    @Column( name = "Imagen" )
    private byte[] imagen;

    @Column( name = "Descripcion" )
    private String descripcion;

    @ManyToOne
    @JoinColumn( name = "Id_Categoria", referencedColumnName = "Id" )
    private Categorias idCategoria;

    @ManyToOne
    @JoinColumn( name = "Id_Desarrollador", referencedColumnName = "Id" )
    private Desarrolladores idDesarrollador;

    @ManyToOne
    @JoinColumn( name = "Id_Plataforma", referencedColumnName = "Id")
    private Plataformas idPlataforma;

    @Column( name = "Precio" )
    private double precio;

    @Column( name = "Stock" )
    private int stock;

    //Constructores
    public Videojuegos() {}
    public Videojuegos(int id, String nombre, byte[] imagen, String descripcion, Categorias idCategoria, Desarrolladores idDesarrollador, Plataformas idPlataforma, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.idCategoria = idCategoria;
        this.idDesarrollador = idDesarrollador;
        this.idPlataforma = idPlataforma;
        this.precio = precio;
        this.stock = stock;
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

    public byte[] getImagen() {
        return imagen;
    }
    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Categorias getIdCategoria() {
        return idCategoria;
    }
    public void setIdCategoria(Categorias idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Desarrolladores getIdDesarrollador() {
        return idDesarrollador;
    }
    public void setIdDesarrollador(Desarrolladores idDesarrollador) {
        this.idDesarrollador = idDesarrollador;
    }

    public Plataformas getIdPlataforma() {
        return idPlataforma;
    }
    public void setIdPlataforma(Plataformas idPlataforma) {
        this.idPlataforma = idPlataforma;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
}
