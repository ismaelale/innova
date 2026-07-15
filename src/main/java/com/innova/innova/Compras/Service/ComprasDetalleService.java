package com.innova.innova.Compras.Service;

import java.util.List;

import org.springframework.stereotype.*;

import com.innova.innova.Compras.Model.ComprasDetalleModel;
import com.innova.innova.Compras.Model.VistaComprasDetalladaModel;
import com.innova.innova.Compras.Repository.ComprasDetalleRepo;
import com.innova.innova.Compras.Repository.VistaComprasDetallada;

@Service
public class ComprasDetalleService {
    
    private final ComprasDetalleRepo detallescompraRepo;
    private final VistaComprasDetallada detalleVistaCompras;

    public ComprasDetalleService(ComprasDetalleRepo detallecomprarepo, VistaComprasDetallada detallevistaCompras){
        this.detallescompraRepo = detallecomprarepo;
        this.detalleVistaCompras = detallevistaCompras;
    }

    public List<VistaComprasDetalladaModel> listaResumenCompras(){
        return detalleVistaCompras.findAll();
    }

    public void AgregarDetalleCompra(ComprasDetalleModel detalleModel){
        detallescompraRepo.save(detalleModel);
    }

}
