package com.innova.innova.Proveedores.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.innova.innova.Proveedores.Service.ProveedorService;

@Controller
@RequestMapping("/app/Proveedores")
public class ProveedorController {
    
    private final ProveedorService proveedorServ;

    public ProveedorController(ProveedorService proveedorservice){
        this.proveedorServ = proveedorservice;
    }

    @GetMapping("/listProveedores")
    public String listProveedores(Model model){
        model.addAttribute("listProveedores", proveedorServ.ProveedoresLista());

        return "Proveedores";
    }

}
