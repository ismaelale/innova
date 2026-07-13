package com.innova.innova.Productos.Controller;

import java.util.List;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.innova.innova.Productos.Model.ProductosModel;
import com.innova.innova.Productos.Service.ProductosService;

import org.springframework.ui.Model; // CAMBIO AQUÍ: ¡Este es el correcto!
@Controller
@RequestMapping("/app/AddGeneral")
public class ProductosController {
    

    private final ProductosService productosService;

    public ProductosController(ProductosService productosservice){
        this.productosService = productosservice;
    }

    @GetMapping("/listProductos")
    @ResponseBody
    public List<ProductosModel> listproductos(){
        return productosService.listProductos();
    }

    @GetMapping("/ver")
    public String verproductos(Model model){
        model.addAttribute("lista", productosService.listProductos());

        return "productos/Productos";
    }

    @PostMapping("/addproductos")
    @ResponseBody
    public String AddProductos(@RequestBody ProductosModel productosModel){
        productosService.AgregarProductos(productosModel);
        return "Producto Agregado Correctamente";
    }


}
