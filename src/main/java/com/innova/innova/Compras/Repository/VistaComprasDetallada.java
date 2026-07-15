package com.innova.innova.Compras.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.innova.innova.Compras.Model.VistaComprasDetalladaModel;

public interface VistaComprasDetallada extends JpaRepository<VistaComprasDetalladaModel, Long> {
    
}
