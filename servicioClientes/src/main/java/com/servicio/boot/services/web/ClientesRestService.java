package com.servicio.boot.services.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DTOTarjetaFidelizacion.mvc.dto.UsuarioCliente;
import com.servicio.boot.services.ClientesService;

@RestController
public class ClientesRestService {

	@Autowired
	private ClientesService clientesService;

	@PostMapping(path = "/altaCliente", produces = MediaType.APPLICATION_JSON_VALUE)
	public UsuarioCliente altaCliente(@RequestBody UsuarioCliente usuarioCliente) {

		clientesService.insertarUsuario(usuarioCliente);
		clientesService.insertarCliente(usuarioCliente);
		return null; 
	}
	
	@GetMapping(path = "/cliente/{loginUsuario}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UsuarioCliente> consultaCliente(@PathVariable String loginUsuario) {

		UsuarioCliente usuarioCliente = clientesService.consultarcliente(loginUsuario);

		return new ResponseEntity<>(usuarioCliente, HttpStatus.OK);
	}

	@GetMapping(path = "/usuario/{loginUsuario}/{claveUsuario}", produces = MediaType.APPLICATION_JSON_VALUE)
	public UsuarioCliente consultaUsuario(@PathVariable String loginUsuario,@PathVariable String claveUsuario) {

		UsuarioCliente usuario = clientesService.consultarUsuario(loginUsuario,claveUsuario);

		return usuario;
	}
}
