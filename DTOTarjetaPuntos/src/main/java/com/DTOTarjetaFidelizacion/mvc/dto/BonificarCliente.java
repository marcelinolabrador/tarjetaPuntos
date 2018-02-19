package com.DTOTarjetaFidelizacion.mvc.dto;

public class BonificarCliente {

	private String loginUsuario;
	
	private int puntos;


	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public String getLoginUsuario() {
		return loginUsuario;
	}

	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}
}
