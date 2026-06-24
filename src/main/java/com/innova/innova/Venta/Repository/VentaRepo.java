package com.innova.innova.Venta.Repository;

import org.springframework.data.jpa.repository.*;

import com.innova.innova.Venta.Model.VentaModel;

public interface VentaRepo extends JpaRepository<VentaModel, Long> {
    
}
