package com.innova.innova.Compras.Model;

import java.sql.Date;

import org.hibernate.annotations.*;

import jakarta.persistence.*;

@Entity
@Table(name = "vistacompras")
@Immutable
public class VistaComprasDetalladaModel {
    
    @Id
    @Column(name = "id")
    private Long id;


    @Column(name ="Fecha_Compra")
    private Date fecha_actual;
    @Column(name = "nombre_producto")
    private String nombre_producto;
    @Column(name = "Nombre_Proveedor")
    private String Nombre_Proveedor;
    @Column(name = "precio_compra")
    private Double precio_compra;
    @Column(name = "precio_venta")
    private Double precio_venta;
    @Column(name = "Cantidad_De_Compra")
    private Integer Cantidad_De_Compra;
    public Long getId() {
        return id;
    }
    public Date getFecha_actual() {
        return fecha_actual;
    }
    public String getNombre_producto() {
        return nombre_producto;
    }
    public String getNombre_Proveedor() {
        return Nombre_Proveedor;
    }
    public Double getPrecio_compra() {
        return precio_compra;
    }
    public Double getPrecio_venta() {
        return precio_venta;
    }
    public Integer getCantidad_De_Compra() {
        return Cantidad_De_Compra;
    }
   
    

    

}
