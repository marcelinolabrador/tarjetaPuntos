package com.DTOTarjetaFidelizacion.mvc.dto;

import javax.validation.constraints.NotEmpty;

public class UsuarioCliente {

	public UsuarioCliente() {}

	public UsuarioCliente(String loginUsuario, String claveUsuario,String tipoUsuario, String nombre, int puntos, String apellidos) {
		
		this.setLoginUsuario(loginUsuario);
		
		this.setApellidos(apellidos);
		this.setClaveUsuario(claveUsuario);
		this.setPuntos(puntos);
		this.setNombre(nombre);
		this.setTipoUsuario(tipoUsuario);
	}
	
	@NotEmpty
	private String loginUsuario;
	
	@NotEmpty
	private String claveUsuario;
	
	private String tipoUsuario;

	@NotEmpty
	private String nombre;
	
	private int puntos;
	
	@NotEmpty
	private String apellidos;

	/**
	 * @return the loginUsuario
	 */
	public String getLoginUsuario() {
		return loginUsuario;
	}

	/**
	 * @param loginUsuario the loginUsuario to set
	 */
	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}

	/**
	 * @return the claveUsuario
	 */
	public String getClaveUsuario() {
		return claveUsuario;
	}

	/**
	 * @param claveUsuario the claveUsuario to set
	 */
	public void setClaveUsuario(String claveUsuario) {
		this.claveUsuario = claveUsuario;
	}

	/**
	 * @return the tipoUsuario
	 */
	public String getTipoUsuario() {
		return tipoUsuario;
	}

	/**
	 * @param tipoUsuario the tipoUsuario to set
	 */
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the puntos
	 */
	public int getPuntos() {
		return puntos;
	}

	/**
	 * @param puntos the puntos to set
	 */
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}	
}
