package com.innova.innova.Facturacion.Service;

import org.springframework.stereotype.*;

import com.innova.innova.Facturacion.Model.FacturaDetalleModel;
import com.innova.innova.Facturacion.Repository.FacturaDetalleRepo;

@Service
public class FacturaDetalleService {
    
    private final FacturaDetalleRepo facturadetalleRepo;

    public FacturaDetalleService(FacturaDetalleRepo facturaDetallerepo){
        this.facturadetalleRepo = facturaDetallerepo;
    }

    public void AgregarDetalleFactura(FacturaDetalleModel facturadetalleModel){
        facturadetalleRepo.save(facturadetalleModel);
    }

}
