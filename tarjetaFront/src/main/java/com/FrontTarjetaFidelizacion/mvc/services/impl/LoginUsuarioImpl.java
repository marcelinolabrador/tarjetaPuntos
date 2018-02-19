package com.FrontTarjetaFidelizacion.mvc.services.impl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.DTOTarjetaFidelizacion.mvc.dto.Usuario;
import com.DTOTarjetaFidelizacion.mvc.dto.UsuarioCliente;
import com.FrontTarjetaFidelizacion.mvc.controller.Constantes;
import com.FrontTarjetaFidelizacion.mvc.services.LoginUsuario;


@Service
public class LoginUsuarioImpl implements LoginUsuario {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public UsuarioCliente loginUsuario(Usuario usuario) {

		HashMap<String, Object> uriVariables = new HashMap<>();
		
		uriVariables.put("loginUsuario", usuario.getLoginUsuario());
		uriVariables.put("claveUsuario", usuario.getClaveUsuario());
		
		ResponseEntity<UsuarioCliente> personajeEntity = restTemplate.getForEntity(Constantes.CONTEXTO_BACK + "/Login/login/{loginUsuario}/{claveUsuario}", UsuarioCliente.class, uriVariables);

		return personajeEntity.getBody();

	}
}
