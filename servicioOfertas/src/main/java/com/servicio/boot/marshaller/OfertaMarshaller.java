package com.servicio.boot.marshaller;

import org.springframework.stereotype.Component;

import com.DTOTarjetaFidelizacion.mvc.dto.OfertaDto;
import com.DTOTarjetaFidelizacion.mvc.marshaller.Marshall;
import com.servicio.boot.entities.Oferta;

@Component
public class OfertaMarshaller implements Marshall<Oferta, OfertaDto> {

	@Override
	public OfertaDto marshall(Oferta oferta){
		
		OfertaDto ofertaDto = new OfertaDto();
		
		ofertaDto.setNombreOferta(oferta.getNombreOferta());
		ofertaDto.setDescripcion(oferta.getDescripcion());
		ofertaDto.setCostePuntos(oferta.getCostePuntos());
		ofertaDto.setFechaAlta(oferta.getFechaAlta());
		ofertaDto.setFechaBaja(oferta.getFechaBaja());
		
		return ofertaDto;
	}
	
	@Override
	public Oferta unMarshall(OfertaDto ofertaDto){
		Oferta oferta = new Oferta();
		
		oferta.setNombreOferta(ofertaDto.getNombreOferta());
		oferta.setDescripcion(ofertaDto.getDescripcion());
		oferta.setCostePuntos(ofertaDto.getCostePuntos());
		oferta.setFechaAlta(ofertaDto.getFechaAlta());
		oferta.setFechaBaja(ofertaDto.getFechaBaja());
		
		return oferta;
	}
	
}
