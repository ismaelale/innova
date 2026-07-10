package com.innova.innova.Clientes.Service;

import org.springframework.stereotype.*;

import com.innova.innova.Clientes.Model.ClienteModel;
import com.innova.innova.Clientes.Repository.ClienteRepo;

@Service
public class ClienteService {
    
    private final ClienteRepo clienteRepo;

    public ClienteService(ClienteRepo clienterepo){
        this.clienteRepo = clienterepo;
    }

    public String AgregarCliente(ClienteModel clienteModel){
        clienteRepo.save(clienteModel);
        return "Cliente Agregado";
    }

}
