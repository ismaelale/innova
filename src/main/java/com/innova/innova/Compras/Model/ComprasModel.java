package com.innova.innova.Compras.Model;

import java.sql.Date;

import com.innova.innova.Proveedores.Model.ProveedorModel;

import jakarta.persistence.*;

@Entity
@Table(name = "compras")
public class ComprasModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "compras_id")

    private Long id;
    private Date fecha_actual;
    
    @ManyToOne
    @JoinColumn(name = "proveedor_id")
    private ProveedorModel proveedorModel;

    public ComprasModel(){

    }

    public ComprasModel(Date fecha_actual, ProveedorModel proveedorModel) {
        this.fecha_actual = fecha_actual;
        this.proveedorModel = proveedorModel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha_actual() {
        return fecha_actual;
    }

    public void setFecha_actual(Date fecha_actual) {
        this.fecha_actual = fecha_actual;
    }

    public ProveedorModel getProveedorModel() {
        return proveedorModel;
    }

    public void setProveedorModel(ProveedorModel proveedorModel) {
        this.proveedorModel = proveedorModel;
    }

    

}
