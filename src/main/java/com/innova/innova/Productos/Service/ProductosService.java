package com.innova.innova.Productos.Service;

import java.util.List;

import org.springframework.stereotype.*;

import com.innova.innova.Productos.Model.ProductosModel;
import com.innova.innova.Productos.Repository.ProductosRepo;

@Service
public class ProductosService {

    private final ProductosRepo productosRepo;

    public ProductosService(ProductosRepo productosrepo){
        this.productosRepo = productosrepo;
    }

    public String AgregarProductos(ProductosModel addproductosmodel){
        productosRepo.save(addproductosmodel);
        return "Producto Agregado";
    }

    public List<ProductosModel> listProductos(){
        return productosRepo.findAll();
    }

}
