package com.servicio.boot.services;

import java.util.List;

import com.DTOTarjetaFidelizacion.mvc.dto.OfertaDto;

public interface OfertasService {
	public List<OfertaDto> consultarOfertas();
}
