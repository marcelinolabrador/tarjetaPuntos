package com.FrontTarjetaFidelizacion.mvc.services;

import java.io.Serializable;
import java.util.List;

import com.DTOTarjetaFidelizacion.mvc.dto.OfertaDto;
import com.DTOTarjetaFidelizacion.mvc.dto.Reserva;
import com.DTOTarjetaFidelizacion.mvc.dto.UsuarioCliente;

public interface ConsultasCliente extends Serializable  {

	public UsuarioCliente getCliente(String loginUsuario);
	
	public List<OfertaDto> getOfertas();
 }
