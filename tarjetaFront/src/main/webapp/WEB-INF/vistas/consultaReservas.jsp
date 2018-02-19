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
<h1>Consulta Reservas</h1>
<body>
	<div class="form-group">
		<table>
			<c:forEach var="reserva" items="${listaReservas}">
				<tr>
					<td><c:out value="${reserva.idUsuario}" /></td>
					<td><c:out value="${reserva.idOferta}" /></td>
				</tr>
			</c:forEach>
			<td><a id="volver" name="volver" href="indexCliente"> <spring:message
						code="fidelizacion.volver" text="Volver" /></a></td>
		</table>
	</div>
</body>
</html>