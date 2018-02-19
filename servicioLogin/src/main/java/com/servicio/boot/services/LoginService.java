package com.servicio.boot.services;

import com.DTOTarjetaFidelizacion.mvc.dto.UsuarioCliente;

public interface LoginService {
	
	public UsuarioCliente consultarcliente(String loginUsuario);
	
	public boolean validarUsuario(String loginUsuario, String claveUsuario);
	
	public UsuarioCliente consultarCliente(String loginUsuario);
}
