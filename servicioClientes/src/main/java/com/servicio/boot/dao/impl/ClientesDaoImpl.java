package com.servicio.boot.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.servicio.boot.dao.ClientesDao;
import com.servicio.boot.entities.Cliente;
import com.servicio.boot.entities.Usuario;

@Repository
public class ClientesDaoImpl implements ClientesDao {

	@Autowired
	MongoTemplate mongoTemplate;

	final String COLLECTIONCLIENTE = "Cliente";

	final String COLLECTIONUSUARIO = "Usuario";

	
	public Cliente findCliente(String loginUsuario) {

		Query query = new Query(Criteria.where("loginUsuario").is(loginUsuario));
		return mongoTemplate.findOne(query, Cliente.class, COLLECTIONCLIENTE);
	}

	public Usuario findUsuario(String loginUsuario, String claveUsuario) {

		Query query = new Query(Criteria.where("loginUsuario").is(loginUsuario).and("claveUsuario").is(claveUsuario));
		return mongoTemplate.findOne(query, Usuario.class, COLLECTIONUSUARIO);
	}	
	
	@Override
	public void insertUsuario(Usuario usuario) {

		mongoTemplate.save(usuario, COLLECTIONUSUARIO);
	}	
	
	@Override
	public void insertCliente(Cliente cliente) {

		mongoTemplate.save(cliente, COLLECTIONCLIENTE);
	}

}
