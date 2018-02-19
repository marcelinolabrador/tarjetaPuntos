package com.servicio.boot.entities;

public class Usuario {

	public Usuario() {}
	
	public Usuario(String loginUsuario,String claveUsuario,String tipoUsuario) {
	
		this.setLoginUsuario(loginUsuario);
		this.setClaveUsuario(claveUsuario);
		this.setTipoUsuario(tipoUsuario);
	}
	
	private String loginUsuario;
	
	private String claveUsuario;
	
	private String tipoUsuario;

	public String getClaveUsuario() {
		return claveUsuario;
	}

	public void setClaveUsuario(String claveUsuario) {
		this.claveUsuario = claveUsuario;
	}

	public String getLoginUsuario() {
		return loginUsuario;
	}

	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
}
