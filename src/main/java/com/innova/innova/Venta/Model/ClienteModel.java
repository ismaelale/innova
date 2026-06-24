package com.innova.innova.Venta.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
public class ClienteModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "cliente_id")
    private Long id;
    private String nombre_cliente;
    private String RTN;

    public ClienteModel(){

    }

    public ClienteModel(String nombre_cliente, String rTN) {
        this.nombre_cliente = nombre_cliente;
        RTN = rTN;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getRTN() {
        return RTN;
    }

    public void setRTN(String rTN) {
        RTN = rTN;
    }

    


}
