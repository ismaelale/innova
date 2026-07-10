package com.innova.innova.Compras.Service;

import org.springframework.stereotype.*;

import com.innova.innova.Compras.Model.ComprasDetalleModel;
import com.innova.innova.Compras.Repository.ComprasDetalleRepo;

@Service
public class ComprasDetalleService {
    
    private final ComprasDetalleRepo detallescompraRepo;

    public ComprasDetalleService(ComprasDetalleRepo detallecomprarepo){
        this.detallescompraRepo = detallecomprarepo;
    }

    public void AgregarDetalleCompra(ComprasDetalleModel detalleModel){
        detallescompraRepo.save(detalleModel);
    }

}
