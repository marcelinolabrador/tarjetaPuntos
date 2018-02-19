package com.servicio.boot.dao;

import com.servicio.boot.entities.Cliente;

public interface BonificarClienteDao {

    public void bonificarCliente(String loginUsuario,int puntos);
    
}
