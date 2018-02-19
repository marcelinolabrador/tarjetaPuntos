package com.servicio.boot.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.servicio.boot.dao.BonificarClienteDao;
import com.servicio.boot.entities.Cliente;

@Repository
public class BonificarClienteDaoImpl implements BonificarClienteDao {

	@Autowired
	MongoTemplate mongoTemplate;
	
	final String COLLECTIONCLIENTE = "Cliente";
	
	public void bonificarCliente(String loginUsuario, int puntos) {

		Query query = new Query();
		
		query = new Query(Criteria.where("loginUsuario").is(loginUsuario));
		
		Cliente cliente = mongoTemplate.findOne(query, Cliente.class, COLLECTIONCLIENTE);
		
		Update update = toUpdate(puntos, cliente);
		
		mongoTemplate.upsert(query, update, COLLECTIONCLIENTE);	
	}
	
	private Update toUpdate(int puntos, Cliente cliente) {
		
		Update update = new Update();
		
		update.set("puntos", cliente.getPuntos()+puntos);
		
		return update;	
	}
}
