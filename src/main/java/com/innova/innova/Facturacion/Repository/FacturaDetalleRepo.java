package com.innova.innova.Facturacion.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.innova.innova.Facturacion.Model.FacturaDetalleModel;

public interface FacturaDetalleRepo extends JpaRepository<FacturaDetalleModel, Long>{
    
}
