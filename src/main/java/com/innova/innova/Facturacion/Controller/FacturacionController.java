package com.innova.innova.Facturacion.Controller;

import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.innova.innova.Facturacion.Model.FacturaDetalleModel;
import com.innova.innova.Facturacion.Model.FacturaModel;
import com.innova.innova.Facturacion.Service.FacturaDetalleService;
import com.innova.innova.Facturacion.Service.FacturaService;

@Controller
@RequestMapping("/app/Facturacion")
public class FacturacionController {
    
    private final FacturaService facturaService;
    private final FacturaDetalleService facturadetalleService;

    public FacturacionController(FacturaService facturaService, FacturaDetalleService facturadetalleService) {
        this.facturaService = facturaService;
        this.facturadetalleService = facturadetalleService;
    }

    @PostMapping("/addFactura")
    public String AgregarFacturas(@RequestBody FacturaModel facturaModel){
        facturaService.AgregarFactura(facturaModel);
        return "Factura Generada";
    }

    @PostMapping("/addFacturaDetalle")
    public void AgregarDetalleFacturas(@RequestBody FacturaDetalleModel facturadetalleModel){
        facturadetalleService.AgregarDetalleFactura(facturadetalleModel);
    }

    @GetMapping("/VistaFacturas")
    public String vistaFactura(Model model){
        model.addAttribute("VistaFacturas", facturadetalleService.reporteFactura());
        return "ReportesFacturas";
    }

}
