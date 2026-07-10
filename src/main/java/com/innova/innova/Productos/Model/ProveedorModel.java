package com.innova.innova.Productos.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "proveedor")
public class ProveedorModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "proveedor_id")

    private Long id;
    private String nombre;
    private String direccion;
    private String email;
    private String numero;
    private String rtn_identidad;

    public ProveedorModel(){

    }

    public ProveedorModel(String nombre, String direccion, String email, String numero, String rtn_identidad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.numero = numero;
        this.rtn_identidad = rtn_identidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRtn_identidad() {
        return rtn_identidad;
    }

    public void setRtn_identidad(String rtn_identidad) {
        this.rtn_identidad = rtn_identidad;
    }

    

}
