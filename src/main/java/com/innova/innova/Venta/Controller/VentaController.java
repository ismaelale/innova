package com.innova.innova.Venta.Controller;

import org.springframework.web.bind.annotation.*;

import com.innova.innova.Venta.Model.VentaModel;
import com.innova.innova.Venta.Service.VentasService;

@RestController
@RequestMapping("/app/ventas")
public class VentaController {
    
    private final VentasService ventasServ;

    public VentaController(VentasService ventasService){
        this.ventasServ = ventasService;
    }

    @PostMapping("/addventa")
    public String addVenta(@RequestBody VentaModel ventaModel){
        ventasServ.addVenta(ventaModel);
        return "Hecho";
    }

}
