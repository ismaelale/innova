package com.innova.innova.Proveedores.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.innova.innova.Proveedores.Model.ProveedorModel;

public interface ProveedorRepo extends JpaRepository<ProveedorModel, Long>{
    
}
