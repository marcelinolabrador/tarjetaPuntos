package com.DTOTarjetaFidelizacion.mvc.marshaller;

public interface Marshall<E,D> {

	D marshall(E entity);

	E unMarshall(D dto);

}