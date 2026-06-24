package com.innova.innova.Productos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.innova.innova.Productos.Model.ProductosModel;

public interface ProductosRepo extends JpaRepository<ProductosModel, Long>{
    
}
