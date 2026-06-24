package com.innova.innova.Productos.Service;

import org.springframework.stereotype.*;

import com.innova.innova.Productos.Model.ProductosModel;
import com.innova.innova.Productos.Repository.ProductosRepo;

@Service
public class ProductosService {
 
    private final ProductosRepo productosrepo;

    public ProductosService(ProductosRepo productosRepo){
        this.productosrepo = productosRepo;
    }

    public String guardarProducto(ProductosModel productosModel){
        productosrepo.save(productosModel);
        return "Producto Agregado";
    }
    
}
