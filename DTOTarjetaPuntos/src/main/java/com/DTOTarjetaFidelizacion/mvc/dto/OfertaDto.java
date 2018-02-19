package com.DTOTarjetaFidelizacion.mvc.dto;


public class OfertaDto {

	public OfertaDto() {
		
	}
	
	public OfertaDto(int costePuntos,String descripcion, String fechaAlta, String fechaBaja, String nombreOferta) {
		this.setCostePuntos(costePuntos);
		this.setDescripcion(descripcion);
		this.setFechaAlta(fechaAlta);
		this.setFechaBaja(fechaBaja);
		this.setNombreOferta(nombreOferta);	
	}
	
	
	private String nombreOferta;
	
	private String descripcion;
	
	private int costePuntos;
	
	private String fechaAlta;
	
	private String fechaBaja;
	
	public String getNombreOferta() {
		return nombreOferta;
	}
	public void setNombreOferta(String nombreOferta) {
		this.nombreOferta = nombreOferta;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCostePuntos() {
		return costePuntos;
	}
	public void setCostePuntos(int costePuntos) {
		this.costePuntos = costePuntos;
	}
	public String getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public String getFechaBaja() {
		return fechaBaja;
	}
	public void setFechaBaja(String fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	
}
