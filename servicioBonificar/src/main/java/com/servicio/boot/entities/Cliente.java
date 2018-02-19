package com.servicio.boot.entities;


public class Cliente {

	
	public Cliente (String loginUsuario, String nombre, String apellidos) {
		
		this.setApellidos(apellidos);
		this.setNombre(nombre);
		this.setLoginUsuario(loginUsuario);
	}
	
	private String loginUsuario;
	
	private String nombre;
	
	private int puntos;
	
	private String apellidos;

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	
}
