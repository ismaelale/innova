package com.innova.innova.Usuarios.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "rol")
public class RolesModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rol_id")

    private Long id;
    private String nombre_rol;

    public RolesModel(){

    }

    public RolesModel(String nombre_rol) {
        this.nombre_rol = nombre_rol;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_rol() {
        return nombre_rol;
    }

    public void setNombre_rol(String nombre_rol) {
        this.nombre_rol = nombre_rol;
    }

    

}
