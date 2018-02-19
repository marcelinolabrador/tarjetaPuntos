package com.FrontTarjetaFidelizacion.mvc.services;

import java.io.Serializable;

import com.DTOTarjetaFidelizacion.mvc.dto.UsuarioCliente;

public interface AltaUsuario extends Serializable  {

	public void altaCliente(UsuarioCliente usuarioCliente);

}