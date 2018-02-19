<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><spring:message code="fidelizacion.consultaClientes"
		text="OBTENER PUNTOS" /></title>
</head>
<body>
	<h1>
		<spring:message code="fidelizacion.consultaClientes"
			text="CONSULTA DE CLIENTES" />
	</h1>
<h3>Bienvenido ${usuarioCliente.nombre }, ${usuarioCliente.apellidos }</h3>
<h3>Actualmente tiene ${usuarioCliente.puntos } puntos</h3>

	<a href="ofertas" name="getOfertas"><spring:message
			code="fidelizacion.consultaClientes.getOfertas"
			text="OBTENER OFERTAS" /></a>

	<a href="logout" id="logout" name="logout"><spring:message
			code="fidelizacion.consultaClientes.logout"
			text="logout" /></a>
</body>
</html>