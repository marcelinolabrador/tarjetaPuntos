package com.FrontTarjetaFidelizacion.mvc.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.DTOTarjetaFidelizacion.mvc.dto.UsuarioCliente;
import com.FrontTarjetaFidelizacion.mvc.controller.Constantes;
import com.FrontTarjetaFidelizacion.mvc.services.AltaUsuario;


@Service
public class AltaUsuarioImpl implements AltaUsuario {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public void altaCliente(UsuarioCliente usuarioCliente) {
		
		HttpHeaders requestHeaders = new HttpHeaders();
		
		requestHeaders.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<UsuarioCliente> entity = new HttpEntity<UsuarioCliente>(usuarioCliente, requestHeaders);
		
		usuarioCliente = restTemplate.postForObject(Constantes.CONTEXTO_BACK + "/Clientes/altaCliente",
				entity, UsuarioCliente.class);

	}
}
