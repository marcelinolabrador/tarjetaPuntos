package com.FrontTarjetaFidelizacion.mvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.DTOTarjetaFidelizacion.mvc.dto.Usuario;
import com.FrontTarjetaFidelizacion.mvc.services.ConsultasCliente;

@Controller
public class ConsultasClienteController {
	
	@ModelAttribute("usuario")
	public Usuario usuario() {
		return new Usuario();
	}
	
	@Autowired
	@Qualifier("consultasClienteImpl")
	private ConsultasCliente consultasCliente;

	@RequestMapping(path = "/ofertas", method = RequestMethod.GET)
	public String consultaOfertas(Model model, HttpSession session) {
		if (session.getAttribute("usuarioCliente") != null) {
		model.addAttribute("listaOfertas", consultasCliente.getOfertas());

		return "consultaOfertas";
		}else {
			return "login";
		}
	}

	@RequestMapping(path = "/indexCliente", method = RequestMethod.GET)
	public String index(Model model, HttpSession session) {
		if (session.getAttribute("usuarioCliente") != null) {
	
			model.addAttribute("usuarioCLiente", session.getAttribute("usuarioCliente"));

		return "indexCliente";
		}else {
			return "login";
		}
	}
}
