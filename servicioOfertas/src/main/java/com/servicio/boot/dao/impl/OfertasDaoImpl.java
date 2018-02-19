package com.servicio.boot.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.servicio.boot.dao.OfertasDao;
import com.servicio.boot.entities.Oferta;

@Repository
public class OfertasDaoImpl implements OfertasDao {

	@Autowired
    MongoTemplate mongoTemplate;
 
    final String COLLECTION = "Oferta";
	
	public List<Oferta> findOfertas() {
		return mongoTemplate.findAll(Oferta.class, COLLECTION);
	}


}
