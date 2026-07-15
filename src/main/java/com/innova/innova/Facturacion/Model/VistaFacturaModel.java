package com.innova.innova.Facturacion.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "vistafactura")
public class VistaFacturaModel {
    
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "Nombre_Productos")
    private String Nombre_Productos;
    @Column(name = "Nombre_Usuario")
    private String Nombre_Usuario;
    @Column(name = "Precio")
    private Double Precio;
    @Column(name = "Impuesto")
    private Double Impuesto;
    @Column(name = "Total")
    private Double Total;
    public Long getId() {
        return id;
    }
    public String getNombre_Productos() {
        return Nombre_Productos;
    }
    public String getNombre_Usuario() {
        return Nombre_Usuario;
    }
    public Double getPrecio() {
        return Precio;
    }
    public Double getImpuesto() {
        return Impuesto;
    }
    public Double getTotal() {
        return Total;
    }

    



}
