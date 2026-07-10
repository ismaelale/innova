package com.innova.innova.Facturacion.Repository;

import org.springframework.data.jpa.repository.*;

import com.innova.innova.Facturacion.Model.FacturaModel;

public interface FacturaRepo extends JpaRepository<FacturaModel, Long> {
    
}
