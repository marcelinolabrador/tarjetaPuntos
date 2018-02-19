package com.servicio.boot.services;

import java.util.List;

import com.DTOTarjetaFidelizacion.mvc.dto.OfertaDto;

public interface BonificarClienteService {
	
	public List<OfertaDto> bonificarClienteService(String loginUsuario, int puntos);
	
}
