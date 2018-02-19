package com.servicio.boot.dao;

import com.servicio.boot.entities.Cliente;
import com.servicio.boot.entities.Usuario;

public interface ClientesDao {

    public Cliente findCliente(String loginUsuario);
    
    public Usuario findUsuario(String loginUsuario, String claveUsuario);
    
    public void insertCliente(Cliente cliente);
    
    public void insertUsuario(Usuario usuario);
}
