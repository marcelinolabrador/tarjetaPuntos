<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><spring:message code="fidelizacion.login"/></title>
</head>
<h1><spring:message code="fidelizacion.login"/></h1>
<body>
	<form:form action="login" method="POST" modelAttribute="usuario">
		<div class="form-group">
			<table>
				<tr>
					<td><spring:message code="fidelizacion.login.nombre"/><form:input path="loginUsuario" id="loginUsuario"
							name="loginUsuario" /></td>
					<td><form:errors path="loginUsuario"></form:errors></td>
				</tr>

				<tr>
					<td><spring:message code="fidelizacion.login.clave"/><form:password path="claveUsuario" id="claveUsuario"
							name="claveUsuario" /></td>
							<td><form:errors path="claveUsuario"></form:errors></td>
				</tr>
				<tr>
					<td><input id="identificarse" name="identificarse"
						value="<spring:message code="fidelizacion.login.identificarse" text="IDENTIFICARSE"/>" type="submit" /></td>

				</tr>
				<tr>
					<td><a href="altaCliente"><spring:message code="fidelizacion.login.registrarseCliente"/></a></td>
				</tr>

			</table>
		</div>
	</form:form>
</body>
</html>