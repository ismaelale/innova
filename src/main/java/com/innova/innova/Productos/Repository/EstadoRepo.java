package com.innova.innova.Productos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.innova.innova.Productos.Model.EstadoModel;

public interface EstadoRepo extends JpaRepository<EstadoModel, Long>{

    
}