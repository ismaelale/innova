package com.innova.innova.Compras.Service;

import org.springframework.stereotype.*;

import com.innova.innova.Compras.Model.ComprasModel;
import com.innova.innova.Compras.Repository.ComprasRepo;

@Service
public class ComprasService {
    
    private final ComprasRepo comprasRepo;

    public ComprasService(ComprasRepo comprasrepo){
        this.comprasRepo = comprasrepo;
    }

    public String AgregarCompra(ComprasModel comprasModel){
        comprasRepo.save(comprasModel);
        return "Nueva Compra de Productos Agregada";
    }
    
       

}
