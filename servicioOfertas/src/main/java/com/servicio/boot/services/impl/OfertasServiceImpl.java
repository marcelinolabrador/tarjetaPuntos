package com.servicio.boot.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DTOTarjetaFidelizacion.mvc.dto.OfertaDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.servicio.boot.dao.OfertasDao;
import com.servicio.boot.entities.Oferta;
import com.servicio.boot.services.OfertasService;
@Service
public class OfertasServiceImpl implements OfertasService {
		
	@Autowired
	private OfertasDao ofertasDao;
	
	
	
	@Autowired
	private ObjectMapper mapper;
	
	public List<OfertaDto> consultarOfertas() {
		
		List<Oferta> ofertasRecuperadas =	ofertasDao.findOfertas();
		
		List<OfertaDto> ofertas = new ArrayList<>();
		
		for(Oferta str : ofertasRecuperadas){
			ofertas.add(mapper.convertValue(str, OfertaDto.class));
		}
		
		return ofertas;
	}

}
