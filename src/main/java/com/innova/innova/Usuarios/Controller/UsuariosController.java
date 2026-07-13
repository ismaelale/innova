package com.innova.innova.Usuarios.Controller;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.innova.innova.Usuarios.Model.UsuariosModel;
import com.innova.innova.Usuarios.Service.UsuariosServ;


@RestController
@RequestMapping("/app/Usuarios")
@CrossOrigin(origins = "http://localhost:5173")
public class UsuariosController {
    
    private final UsuariosServ usuariosServ;

    public UsuariosController(UsuariosServ usuariosserv){
        this.usuariosServ = usuariosserv;
    }

    @PostMapping("/login")
    public ResponseEntity <?> login(@RequestBody UsuariosModel usuarios) {
        
        if("imuoz".equals(usuarios.getUsuario()) && "1234".equals(usuarios.getContraseña())){
            return ResponseEntity.ok("hola");
        }
        
        return ResponseEntity.status(401).body(null);
    }
    


    @PostMapping("/addUsuario")
    public String AgregarUsuarios(@RequestBody UsuariosModel usuariosModel){
        usuariosServ.AgregarUsuario(usuariosModel);
        return "Usuario agregado Correctamente";
    }

}
