package com.servicio.boot.services.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.DTOTarjetaFidelizacion.mvc.dto.UsuarioCliente;
import com.servicio.boot.services.LoginService;

@RestController
public class LoginRestService {

	@Autowired
	private LoginService loginService;

	
	@GetMapping(path = "/login/{loginUsuario}/{claveUsuario}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UsuarioCliente> consultaCliente(@PathVariable String loginUsuario, @PathVariable String claveUsuario) {

		if (loginService.validarUsuario(loginUsuario, claveUsuario)) {
			
			UsuarioCliente cliente = loginService.consultarCliente(loginUsuario);
		
			return new ResponseEntity<>(cliente, HttpStatus.OK);
		}else {
			throw new RuntimeException();
		}
	}
}
