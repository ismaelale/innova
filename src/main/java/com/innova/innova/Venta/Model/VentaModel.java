package com.innova.innova.Venta.Model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.innova.innova.Productos.Model.ProductosModel;

import jakarta.persistence.*;

@Entity
@Table(name = "venta")
public class VentaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private ClienteModel clienteModel;
   
    @ManyToOne
    @JoinColumn(name = "producto_id")
    private ProductosModel productosModel;

    private int cantidad;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fecha_venta;

    public VentaModel(){

    }

    public VentaModel(ClienteModel clienteModel, ProductosModel productosModel, int cantidad, LocalDate fecha_venta) {
        this.clienteModel = clienteModel;
        this.productosModel = productosModel;
        this.cantidad = cantidad;
        this.fecha_venta = fecha_venta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ClienteModel getClienteModel() {
        return clienteModel;
    }

    public void setClienteModel(ClienteModel clienteModel) {
        this.clienteModel = clienteModel;
    }

    public ProductosModel getProductosModel() {
        return productosModel;
    }

    public void setProductosModel(ProductosModel productosModel) {
        this.productosModel = productosModel;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(LocalDate fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    


}
