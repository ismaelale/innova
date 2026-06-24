package com.innova.innova.Productos.Controller;

import org.springframework.web.bind.annotation.*;

import com.innova.innova.Productos.Model.ProductosModel;
import com.innova.innova.Productos.Service.ProductosService;

@RestController
@RequestMapping("/app/productos")
public class ProductosController {
    
    private final ProductosService productosServ;

    public ProductosController(ProductosService productosService){
        this.productosServ = productosService;
    }

    @PostMapping("/guardarProductos")
    public String addProductos(@RequestBody ProductosModel productosModel){
        return productosServ.guardarProducto(productosModel);
    }

}
