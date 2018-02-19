package com.FrontTarjetaFidelizacion.mvc.services;

import java.io.Serializable;

import org.springframework.http.ResponseEntity;

import com.DTOTarjetaFidelizacion.mvc.dto.Usuario;
import com.DTOTarjetaFidelizacion.mvc.dto.UsuarioCliente;



public interface LoginUsuario extends Serializable  {

	public UsuarioCliente loginUsuario(Usuario usuario);

}
