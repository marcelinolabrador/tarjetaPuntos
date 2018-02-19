package com.FrontTarjetaFidelizacion.mvc.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.DTOTarjetaFidelizacion.mvc.dto.UsuarioCliente;
import com.FrontTarjetaFidelizacion.mvc.services.AltaUsuario;

@Controller
public class AltaUsuarioController {

	@Autowired
	@Qualifier("altaUsuarioImpl")
	private AltaUsuario altaUsuario;

	@RequestMapping(path = Constantes.FORWARD_SLASH + "altaCliente", method = RequestMethod.GET)
	public String altaCliente(Map<String, Object> model) {

		model.put("usuarioCliente", new UsuarioCliente());

		return "altaCliente";
	}

	@RequestMapping(path = Constantes.FORWARD_SLASH + "altaCliente", method = RequestMethod.POST)
	public String altaCliente(Map<String, Object> model,
			@Valid @ModelAttribute("usuarioCliente") UsuarioCliente usuarioCliente, Errors errors,
			HttpSession session) {

		if (!errors.hasErrors()) {
			
			altaUsuario.altaCliente(usuarioCliente);
			
			session.setAttribute("usuarioCliente", usuarioCliente );

			model.put("usuarioCliente", usuarioCliente);
			
			return "indexCliente";
		} else {
			return "altaCliente";
		}
	}
}
