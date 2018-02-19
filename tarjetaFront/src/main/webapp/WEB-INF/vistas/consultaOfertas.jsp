<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>puntos</title>
</head>
<h1>Consulta Ofertas</h1>
<body>
	<div class="form-group">
		<table>
			<c:forEach var="oferta" items="${listaOfertas}">
				<tr>
					<td><c:out value="${oferta.nombreOferta}" /></td>
					<td><c:out value="${oferta.descripcion}" /></td>
					<td><c:out value="${oferta.costePuntos}" /></td>
					<td><c:out value="${oferta.fechaAlta}" /></td>
					<td><c:out value="${oferta.fechaBaja}" /></td>
				</tr>
			</c:forEach>
			<td><a id="volver" name="volver" href="indexCliente"> <spring:message
						code="fidelizacion.volver" text="Volver" /></a></td>
		</table>
	</div>
</body>
</html>