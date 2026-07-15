package com.innova.innova.Proveedores.Service;

import java.util.List;

import org.springframework.stereotype.*;

import com.innova.innova.Proveedores.Model.ProveedorModel;
import com.innova.innova.Proveedores.Repository.ProveedorRepo;

@Service
public class ProveedorService {
    
    private final ProveedorRepo proveedorRepo;

    public ProveedorService(ProveedorRepo proveedorrepo){
        this.proveedorRepo = proveedorrepo;
    }

    public List<ProveedorModel> ProveedoresLista(){
        return proveedorRepo.findAll();
    }

}
