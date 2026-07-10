package com.innova.innova.Compras.Model;

import com.innova.innova.Productos.Model.ProductosModel;

import jakarta.persistence.*;

@Entity
@Table(name = "detalle_compra")
public class ComprasDetalleModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detalleCompra_id")

    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "compras_id")
    private ComprasModel comprasModel;

    @ManyToOne
    @JoinColumn(name = "productos_id")
    private ProductosModel productosModel;

    private Integer cantidad;
    private Double precio_compra;
    private Double subtotal;
    private Double isv;

    public ComprasDetalleModel(){

    }

    public ComprasDetalleModel(ComprasModel comprasModel, ProductosModel productosModel, Integer cantidad,
            Double precio_compra, Double subtotal, Double isv) {
        this.comprasModel = comprasModel;
        this.productosModel = productosModel;
        this.cantidad = cantidad;
        this.precio_compra = precio_compra;
        this.subtotal = subtotal;
        this.isv = isv;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ComprasModel getComprasModel() {
        return comprasModel;
    }

    public void setComprasModel(ComprasModel comprasModel) {
        this.comprasModel = comprasModel;
    }

    public ProductosModel getProductosModel() {
        return productosModel;
    }

    public void setProductosModel(ProductosModel productosModel) {
        this.productosModel = productosModel;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(Double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getIsv() {
        return isv;
    }

    public void setIsv(Double isv) {
        this.isv = isv;
    }
    
    

}
