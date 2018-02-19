package com.servicio.boot.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.DTOTarjetaFidelizacion.mvc.dto.OfertaDto;
import com.DTOTarjetaFidelizacion.mvc.dto.UsuarioCliente;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.servicio.boot.dao.BonificarClienteDao;
import com.servicio.boot.entities.Cliente;
import com.servicio.boot.entities.Usuario;
import com.servicio.boot.services.BonificarClienteService;
@Service
public class BonificarClienteServiceImpl implements BonificarClienteService {
		
	@Autowired
	private BonificarClienteDao bonificarClienteDao;

	@Override
	public List<OfertaDto> bonificarClienteService(String loginUsuario, int puntos) {
		
		bonificarClienteDao.bonificarCliente(loginUsuario, puntos);
	
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<List> personajeEntity = restTemplate.getForEntity("http://localhost:8380/BackOfertas/ofertas", List.class);

		return personajeEntity.getBody();
		
	}
}
