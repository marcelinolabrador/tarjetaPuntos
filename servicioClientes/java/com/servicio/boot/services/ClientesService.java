package com.servicio.boot.services;

import com.DTOTarjetaFidelizacion.mvc.dto.UsuarioCliente;

public interface ClientesService {
	
	public UsuarioCliente consultarcliente(String loginUsuario);
	
	public UsuarioCliente consultarUsuario(String loginUsuario,String claveUsuario);
	
	public void insertarCliente(UsuarioCliente cliente);
	
	public void insertarUsuario(UsuarioCliente usuario);
}
