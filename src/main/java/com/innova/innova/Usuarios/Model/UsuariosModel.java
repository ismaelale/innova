package com.innova.innova.Usuarios.Model;

import java.sql.Blob;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class UsuariosModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")

    
    private Long id;
    private String nombre_apellido;
    private String usuario;
    private String contraseña;
    
    @ManyToOne
    @JoinColumn(name = "rol_id")
    private RolesModel rol;

    public UsuariosModel(){

    }

    public UsuariosModel(String nombre_apellido, String usuario, String contraseña, RolesModel rol) {
        this.nombre_apellido = nombre_apellido;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.rol = rol;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public RolesModel getRol() {
        return rol;
    }

    public void setRol(RolesModel rol) {
        this.rol = rol;
    }


}
