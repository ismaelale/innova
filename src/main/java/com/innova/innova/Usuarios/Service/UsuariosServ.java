package com.innova.innova.Usuarios.Service;

import org.springframework.stereotype.*;

import com.innova.innova.Usuarios.Model.UsuariosModel;
import com.innova.innova.Usuarios.Repository.UsuariosRepo;

@Service
public class UsuariosServ {
    
    private final UsuariosRepo usuarioRepo;

    public UsuariosServ(UsuariosRepo usuariorepo){
        this.usuarioRepo = usuariorepo;
    }

    public String AgregarUsuario(UsuariosModel usuarioModel){
        usuarioRepo.save(usuarioModel);
        return "Usuario Agregado";
    }

}
