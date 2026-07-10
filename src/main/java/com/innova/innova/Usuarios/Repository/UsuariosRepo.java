package com.innova.innova.Usuarios.Repository;

import org.springframework.data.jpa.repository.*;

import com.innova.innova.Usuarios.Model.UsuariosModel;

public interface UsuariosRepo extends JpaRepository<UsuariosModel, Long>{
    
}
