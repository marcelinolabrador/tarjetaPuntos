<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><spring:message code="fidelizacion.altaCliente" /></title>
</head>
<body>
	<h1>
		<spring:message code="fidelizacion.altaCliente" />
	</h1>
	<form:form action="altaCliente" method="POST" modelAttribute="usuarioCliente">
		<div class="form-group">
			<table>
				<tr>
					<td><spring:message code="fidelizacion.altaCliente.usuario" />
						<form:input path="loginUsuario" id="loginUsuario"
							name="loginUsuario" /></td>
							<td><form:errors path="loginUsuario"></form:errors></td>
				</tr>
				<tr>
					<td><spring:message code="fidelizacion.altaCliente.clave" />
						<form:password path="claveUsuario" id="claveUsuario"
							name="claveUsuario" /></td>
							<td><form:errors path="claveUsuario"></form:errors></td>
				</tr>
				<tr>
					<td><spring:message code="fidelizacion.altaCliente.nombre" />
						<form:input path="nombre" id="nombre" name="nombre" /></td>
						<td><form:errors path="nombre"></form:errors></td>
				</tr>
				<tr>
					<td><spring:message code="fidelizacion.altaCliente.apellidos" />
						<form:input path="apellidos" id="apellidos" name="apellidos" /></td>
				<td><form:errors path="apellidos"></form:errors></td>
				</tr>
				<tr>
					<td><input id="registrarse" name="registrarse"
						value="<spring:message code="fidelizacion.altaCliente.registrarse" text="REGISTRARSE"/>"
						type="submit" /></td>
					<td><a id="login" name="login" href="login" >
					<spring:message code="fidelizacion.volver" text="Volver" /></a></td>
				</tr>
			</table>
		</div>
	</form:form>
</body>
</html>