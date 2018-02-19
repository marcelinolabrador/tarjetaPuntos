package com.FrontTarjetaFidelizacion.mvc.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.DTOTarjetaFidelizacion.mvc.dto.Usuario;
import com.DTOTarjetaFidelizacion.mvc.dto.UsuarioCliente;
import com.FrontTarjetaFidelizacion.mvc.services.ConsultasCliente;
import com.FrontTarjetaFidelizacion.mvc.services.LoginUsuario;

@Controller
public class LoginController {

	@ModelAttribute("usuario")
	public Usuario usuario() {
		return new Usuario();
	}

	@Autowired
	@Qualifier("loginUsuarioImpl")
	private LoginUsuario loginUsuario;

	@Autowired
	@Qualifier("consultasClienteImpl")
	private ConsultasCliente consultasCliente;

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String loginUsuario(@Valid @ModelAttribute("usuario") Usuario usuario, Errors errors, HttpSession session,
			Map<String, Object> model) {

		if (!errors.hasErrors()) {
			UsuarioCliente cliente= new UsuarioCliente();
			
			try {

				cliente = loginUsuario.loginUsuario(usuario);

			} catch (Exception e) {
				return "login";
			}

			session.setAttribute("usuarioCliente", cliente);

			model.put("usuarioCliente", cliente);

			return "indexCliente";

		} else {
			return "login";
		}
	}

	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String login(Map<String, Object> model) {

		return "login";
	}

	@RequestMapping(path = "logout", method = RequestMethod.GET)
	public String login(Map<String, Object> model, HttpSession session) {

		session.setAttribute("usuarioCliente", null);

		return "login";
	}
}
