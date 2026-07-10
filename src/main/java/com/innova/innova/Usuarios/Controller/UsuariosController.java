package com.innova.innova.Usuarios.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;

import com.innova.innova.Usuarios.Model.UsuariosModel;
import com.innova.innova.Usuarios.Service.UsuariosServ;

@RestController
@RequestMapping("/app/Usuarios")
public class UsuariosController {
    
    private final UsuariosServ usuariosServ;

    public UsuariosController(UsuariosServ usuariosserv){
        this.usuariosServ = usuariosserv;
    }

    @PostMapping("/addUsuario")
    public String AgregarUsuarios(@RequestBody UsuariosModel usuariosModel){
        usuariosServ.AgregarUsuario(usuariosModel);
        return "Usuario agregado Correctamente";
    }

}
