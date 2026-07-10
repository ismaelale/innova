package com.innova.innova.Productos.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "estado")
public class EstadoModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estado_id")

    private Long id;
    private String estado;
    
    public EstadoModel(){
        
    }

    public EstadoModel(String estado) {
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    

}
