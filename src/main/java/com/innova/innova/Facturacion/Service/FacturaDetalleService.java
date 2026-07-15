package com.innova.innova.Facturacion.Service;

import java.util.List;

import org.springframework.stereotype.*;

import com.innova.innova.Facturacion.Model.FacturaDetalleModel;
import com.innova.innova.Facturacion.Model.VistaFacturaModel;
import com.innova.innova.Facturacion.Repository.FacturaDetalleRepo;
import com.innova.innova.Facturacion.Repository.VistaFacturaRepo;

@Service
public class FacturaDetalleService {
    
    private final FacturaDetalleRepo facturadetalleRepo;
    private final VistaFacturaRepo vistafacturaRepo;

    public FacturaDetalleService(FacturaDetalleRepo facturaDetallerepo, VistaFacturaRepo vistafacturarepo){
        this.facturadetalleRepo = facturaDetallerepo;
        this.vistafacturaRepo = vistafacturarepo;
    }

    public void AgregarDetalleFactura(FacturaDetalleModel facturadetalleModel){
        facturadetalleRepo.save(facturadetalleModel);
    }

    //VISTA DE FACTURA
    public List<VistaFacturaModel> reporteFactura(){
        return vistafacturaRepo.findAll();
    }

}
