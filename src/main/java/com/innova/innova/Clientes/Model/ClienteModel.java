package com.innova.innova.Clientes.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
public class ClienteModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cliente_id")

    private Long id;
    private String nombre_apellido;
    private String rtn_identidad;
    private String email;
    private String numero;

    public ClienteModel(){

    }

    public ClienteModel(String nombre_apellido, String rtn_identidad, String email, String numero) {
        this.nombre_apellido = nombre_apellido;
        this.rtn_identidad = rtn_identidad;
        this.email = email;
        this.numero = numero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_apellido() {
        return nombre_apellido;
    }

    public void setNombre_apellido(String nombre_apellido) {
        this.nombre_apellido = nombre_apellido;
    }

    public String getRtn_identidad() {
        return rtn_identidad;
    }

    public void setRtn_identidad(String rtn_identidad) {
        this.rtn_identidad = rtn_identidad;
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

    
    

}
