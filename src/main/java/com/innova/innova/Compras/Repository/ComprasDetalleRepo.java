package com.innova.innova.Compras.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.innova.innova.Compras.Model.ComprasDetalleModel;

public interface ComprasDetalleRepo extends JpaRepository<ComprasDetalleModel, Long>{
    
}
