package com.servicio.boot.services.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.DTOTarjetaFidelizacion.mvc.dto.OfertaDto;
import com.servicio.boot.services.OfertasService;

@RestController
public class OfertasRestService {

	@Autowired
	private OfertasService ofertasService;

	@GetMapping(path = "/ofertas", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List> consultaOfertas() {

		List<OfertaDto> listaOfertas = ofertasService.consultarOfertas();

		return new ResponseEntity<>(listaOfertas, HttpStatus.OK);
	}

}
