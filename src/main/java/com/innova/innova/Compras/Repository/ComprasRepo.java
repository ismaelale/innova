package com.innova.innova.Compras.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.innova.innova.Compras.Model.ComprasModel;

public interface ComprasRepo extends JpaRepository<ComprasModel, Long> {
    
}
