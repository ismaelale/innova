package com.innova.innova.Compras.Controller;

import org.springframework.web.bind.annotation.*;

import com.innova.innova.Compras.Model.ComprasDetalleModel;
import com.innova.innova.Compras.Model.ComprasModel;
import com.innova.innova.Compras.Service.ComprasDetalleService;
import com.innova.innova.Compras.Service.ComprasService;

@RestController
@RequestMapping("/app/Compras")
public class ControllerCompras {
    
    private final ComprasService comprasService;
    private final ComprasDetalleService detallecompraService;

    public ControllerCompras(ComprasService comprasservice, ComprasDetalleService detallecompraservice){
        this.comprasService = comprasservice;
        this.detallecompraService = detallecompraservice;
    }

    @PostMapping("/addCompra")
    public String AgregarCompraProductos(@RequestBody ComprasModel comprasModel){
        comprasService.AgregarCompra(comprasModel);
        return "Compra de Productos Agregada";
    }

    @PostMapping("/addCompraDetallada")
    public void AgregarDetalleCompra(@RequestBody ComprasDetalleModel detallecompramodel){
        detallecompraService.AgregarDetalleCompra(detallecompramodel);
    }

}
