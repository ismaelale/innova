package com.innova.innova.Venta.Service;

import org.springframework.stereotype.*;

import com.innova.innova.Venta.Model.VentaModel;
import com.innova.innova.Venta.Repository.VentaRepo;

@Service
public class VentasService {
    
    private final VentaRepo ventaRepo;

    public VentasService(VentaRepo ventaRepo){
        this.ventaRepo = ventaRepo;
    }

    public String addVenta(VentaModel ventaModel){
        ventaRepo.save(ventaModel);
        return "Venta Hecha";
    }

}
