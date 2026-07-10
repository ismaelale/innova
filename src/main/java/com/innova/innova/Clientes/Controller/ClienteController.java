package com.innova.innova.Clientes.Controller;

import org.springframework.web.bind.annotation.*;

import com.innova.innova.Clientes.Model.ClienteModel;
import com.innova.innova.Clientes.Service.ClienteService;

@RestController
@RequestMapping("/app/Cliente")
public class ClienteController {
    
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping("/addCliente")
    public String AgregarClientes(@RequestBody ClienteModel clienteModel){
        clienteService.AgregarCliente(clienteModel);
        return "Cliente Agregado Exitosamente";
    }

}
