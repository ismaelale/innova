package com.innova.innova.Clientes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.innova.innova.Clientes.Model.ClienteModel;

public interface ClienteRepo extends JpaRepository<ClienteModel, Long>{
    
}
