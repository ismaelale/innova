package com.innova.innova.Productos.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "presentaciones")
public class PresentacionModel {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "presentacion_id")

    private Long id;
    private String tipo_presentacion;
    
    public PresentacionModel(){

    }
    
    public PresentacionModel(String tipo_presentacion) {
        this.tipo_presentacion = tipo_presentacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo_presentacion() {
        return tipo_presentacion;
    }

    public void setTipo_presentacion(String tipo_presentacion) {
        this.tipo_presentacion = tipo_presentacion;
    }

    
    


}
