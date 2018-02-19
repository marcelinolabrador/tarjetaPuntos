package com.servicio.boot.services.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.DTOTarjetaFidelizacion.mvc.dto.Usuario;
import com.DTOTarjetaFidelizacion.mvc.dto.UsuarioCliente;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.servicio.boot.services.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Override
	public UsuarioCliente consultarcliente(String loginUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	HashMap<String, Object> uriVariables = new HashMap<>();

	@Override
	public boolean validarUsuario(String loginUsuario, String claveUsuario) {

		RestTemplate restTemplate = new RestTemplate();

		HashMap<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("loginUsuario", loginUsuario);
		uriVariables.put("claveUsuario", claveUsuario);
		
		UsuarioCliente usuario = restTemplate.getForObject(
				"http://localhost:8380/Clientes/usuario/{loginUsuario}/{claveUsuario}",
				UsuarioCliente.class, uriVariables);
		
		if (usuario != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public UsuarioCliente consultarCliente(String loginUsuario) {

		RestTemplate restTemplate = new RestTemplate();

		HashMap<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("loginUsuario", loginUsuario);

		UsuarioCliente cliente = restTemplate.getForObject(
				"http://localhost:8380/Clientes/cliente/{loginUsuario}", UsuarioCliente.class,
				uriVariables);
		return cliente;
	}

}
