package com.innova.innova.Facturacion.Service;

import org.springframework.stereotype.*;

import com.innova.innova.Facturacion.Model.FacturaModel;
import com.innova.innova.Facturacion.Repository.FacturaRepo;

@Service
public class FacturaService {
    
    private FacturaRepo facturaRepo;
    
    public FacturaService(FacturaRepo facturarepo){
        this.facturaRepo = facturarepo;
    }

    public String AgregarFactura(FacturaModel facturaModel){
        facturaRepo.save(facturaModel);
        return "Factura Agregada";
    }

    

}
