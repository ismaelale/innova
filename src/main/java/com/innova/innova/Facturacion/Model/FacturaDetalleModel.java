package com.innova.innova.Facturacion.Model;

import java.sql.Date;

import com.innova.innova.Clientes.Model.ClienteModel;
import com.innova.innova.Productos.Model.ProductosModel;
import com.innova.innova.Usuarios.Model.UsuariosModel;

import jakarta.persistence.*;

@Entity
@Table(name = "factura_detalle")
public class FacturaDetalleModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detalle_id")

    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "factura_id")
    private FacturaModel facturaModel;

    @ManyToOne
    @JoinColumn(name = "productos_id")
    private ProductosModel productoModel;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private UsuariosModel usuarioModel;
    
    private Double precio;
    private Integer cantidad;
    private Double isv;

    public FacturaDetalleModel(){

    }

    public FacturaDetalleModel(FacturaModel facturaModel, ProductosModel productoModel,
            UsuariosModel usuarioModel, Double precio, Integer cantidad, Double isv) {
        this.facturaModel = facturaModel;
        this.productoModel = productoModel;
        this.usuarioModel = usuarioModel;
        this.precio = precio;
        this.cantidad = cantidad;
        this.isv = isv;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FacturaModel getFacturaModel() {
        return facturaModel;
    }

    public void setFacturaModel(FacturaModel facturaModel) {
        this.facturaModel = facturaModel;
    }

    public ProductosModel getProductoModel() {
        return productoModel;
    }

    public void setProductoModel(ProductosModel productoModel) {
        this.productoModel = productoModel;
    }

    public UsuariosModel getUsuarioModel() {
        return usuarioModel;
    }

    public void setUsuarioModel(UsuariosModel usuarioModel) {
        this.usuarioModel = usuarioModel;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getIsv() {
        return isv;
    }

    public void setIsv(Double isv) {
        this.isv = isv;
    }

    

}
