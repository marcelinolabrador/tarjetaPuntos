package com.servicio.boot.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DTOTarjetaFidelizacion.mvc.dto.UsuarioCliente;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.servicio.boot.dao.ClientesDao;
import com.servicio.boot.entities.Cliente;
import com.servicio.boot.entities.Usuario;
import com.servicio.boot.services.ClientesService;
@Service
public class ClientesServiceImpl implements ClientesService {
		
	@Autowired
	private ClientesDao clientesDao;
	
	
	@Autowired
	private ObjectMapper mapper;

	@Override
	public UsuarioCliente consultarcliente(String loginUsuario) {	
	
		return mapper.convertValue(clientesDao.findCliente(loginUsuario), UsuarioCliente.class);
	}


	@Override
	public void insertarCliente(UsuarioCliente cliente) {
		
		clientesDao.insertCliente(mapper.convertValue(cliente, Cliente.class));
		
	}


	@Override
	public void insertarUsuario(UsuarioCliente usuario) {
		clientesDao.insertUsuario(mapper.convertValue(usuario, Usuario.class));
		
	}


	@Override
	public UsuarioCliente consultarUsuario(String loginUsuario, String claveUsuario) {
		// TODO Auto-generated method stub
		return mapper.convertValue(clientesDao.findUsuario(loginUsuario,claveUsuario), UsuarioCliente.class);
	}


}
