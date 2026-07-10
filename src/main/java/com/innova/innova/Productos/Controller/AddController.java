package com.innova.innova.Productos.Controller;

import org.springframework.web.bind.annotation.*;

import com.innova.innova.Productos.Model.ProductosModel;
import com.innova.innova.Productos.Service.ProductosService;

@RestController
@RequestMapping("/app/AddGeneral")
public class AddController {
    

    private final ProductosService productosService;

    public AddController(ProductosService productosservice){
        this.productosService = productosservice;
    }

    @PostMapping("/addproductos")
    public String AddProductos(@RequestBody ProductosModel productosModel){
        productosService.AgregarProductos(productosModel);
        return "Producto Agregado Correctamente";
    }


}
