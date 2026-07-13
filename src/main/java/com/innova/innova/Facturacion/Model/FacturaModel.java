package com.innova.innova.Facturacion.Model;

import java.time.LocalDate;

import com.innova.innova.Clientes.Model.ClienteModel;

import jakarta.persistence.*;

@Entity
@Table(name = "factura_venta")
public class FacturaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "factura_id")

    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private ClienteModel clienteModel;

    private String comentario;
    private LocalDate fecha_venta;

    public FacturaModel(){

    }

    public FacturaModel(ClienteModel clienteModel, String comentario, LocalDate fecha_venta) {
        this.clienteModel = clienteModel;
        this.comentario = comentario;
        this.fecha_venta = fecha_venta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ClienteModel getClienteModel() {
        return clienteModel;
    }

    public void setClienteModel(ClienteModel clienteModel) {
        this.clienteModel = clienteModel;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDate getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(LocalDate fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    
    

}
