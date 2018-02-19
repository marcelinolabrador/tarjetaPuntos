package com.FrontTarjetaFidelizacion.mvc.services.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.DTOTarjetaFidelizacion.mvc.dto.OfertaDto;
import com.DTOTarjetaFidelizacion.mvc.dto.Reserva;
import com.DTOTarjetaFidelizacion.mvc.dto.UsuarioCliente;
import com.FrontTarjetaFidelizacion.mvc.controller.Constantes;
import com.FrontTarjetaFidelizacion.mvc.services.ConsultasCliente;


@Service
public class ConsultasClienteImpl implements ConsultasCliente {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public UsuarioCliente getCliente(String loginUsuario) {

		HashMap<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("loginUsuario", loginUsuario);
		
		ResponseEntity<UsuarioCliente> personajeEntity = restTemplate.getForEntity(Constantes.CONTEXTO_BACK + "/Clientes/cliente/{loginUsuario}", UsuarioCliente.class, uriVariables);

		return personajeEntity.getBody();
	}

	@Override
	public List<OfertaDto> getOfertas() {
	
		ResponseEntity<List> personajeEntity = restTemplate.getForEntity(Constantes.CONTEXTO_BACK + "/BackOfertas/ofertas", List.class);

		return personajeEntity.getBody();
	}
}
