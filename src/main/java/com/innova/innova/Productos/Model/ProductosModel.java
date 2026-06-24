package com.innova.innova.Productos.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class ProductosModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "producto_id")

    private Long id;
    private String nombre_producto;
    private double precio_compra;
    private double precio_venta;
    private String descripcion;
    private int stock;

    @ManyToOne
    @JoinColumn(name = "presentacion_id")
    private PresentacionModel presentacionmodelo;

    public ProductosModel(){
        
    }

    public ProductosModel(String nombre_producto, double precio_compra, double precio_venta, String descripcion,
            int stock, PresentacionModel presentacionModel) {
        this.nombre_producto = nombre_producto;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
        this.descripcion = descripcion;
        this.stock = stock;
        this.presentacionmodelo = presentacionModel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public PresentacionModel getPresentacionModelo() {
        return presentacionmodelo;
    }

    public void setPresentacionModelo(PresentacionModel presentacionModelo) {
        this.presentacionmodelo = presentacionModelo;
    }

}
