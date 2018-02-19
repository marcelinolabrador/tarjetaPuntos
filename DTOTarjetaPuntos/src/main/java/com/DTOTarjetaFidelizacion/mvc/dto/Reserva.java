package com.DTOTarjetaFidelizacion.mvc.dto;


public class Reserva {

	
	public Reserva(int ifOferta, int idUsuario) {
		this.setIdOferta(idOferta);
		this.setIdUsuario(idUsuario);
	}
	
	private int idUsuario;
	
	private int idOferta;
	
	public int getIdOferta() {
		return idOferta;
	}
	public void setIdOferta(int idOferta) {
		this.idOferta = idOferta;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
}
