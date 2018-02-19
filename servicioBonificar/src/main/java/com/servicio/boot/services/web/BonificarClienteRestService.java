package com.servicio.boot.services.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DTOTarjetaFidelizacion.mvc.dto.BonificarCliente;
import com.DTOTarjetaFidelizacion.mvc.dto.OfertaDto;
import com.servicio.boot.services.BonificarClienteService;

@RestController
public class BonificarClienteRestService {

	@Autowired
	private BonificarClienteService bonificarClienteService;

	@PostMapping(path = "/bonificarCliente", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<OfertaDto> bonificar(@RequestBody BonificarCliente bonificar) {

		return bonificarClienteService.bonificarClienteService(bonificar.getLoginUsuario(), bonificar.getPuntos());

	}
}