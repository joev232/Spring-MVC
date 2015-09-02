<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="js/script.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Formulario</title>
</head>
<body onload="getPlaceHolderEdad()">

<a href="registrarPersona?lng=es"><img alt="Bandera española" width="50" height="50" src="images/es.png"></a>
<a href="registrarPersona?lng=it"><img alt="Bandera italiana" width="50" height="50" src="images/it.png"></a>
<a href="registrarPersona?lng=en"><img alt="Bandera Inglesa" width="50" height="50" src="images/uk.png"></a>


	<table border="1px"> 
		<form:form method="POST" modelAttribute="persona" enctype="multipart/form-data">

			<tr>
				<th align="left"><label for="nombre"><spring:message code="formnombre"></spring:message></label></th>
				<td><form:input type="text" path="nombre" id="nombre" placeholder="Nombre"/></td>
				<td><form:errors path="nombre" class="errorsp" /></td>
			</tr>

			<tr>
				<th align="left"><label for="edad"><spring:message code="formedad"></spring:message></label></th>
				<td><form:input type="text" path="edad" id="edad" placeholder="Edad" /></td>
				<td><form:errors path="edad" class="errorsp" /></td>
			</tr>

			<tr>
				<th align="left"><label for="DNI"><spring:message code="formdni"></spring:message></label>
				<td><form:input onchange="pedirLetraDNI()" type="text" path="dni" id="dni" placeholder="DNI" /></td>
				<td><form:errors path="dni" class="errorsp" /></td>
			</tr>

			<tr>
				<th align="left"><label for="descripcion"><spring:message code="formdesc"></spring:message></label></th>
				<td><form:textarea type="text" path="descripcion" id="descripcion" placeholder="Descripción" /></td>
				<td><form:errors path="descripcion" class="errorsp" /></td>
			</tr>

			<tr>
				<th align="left"><label for="nacionalidad">Nacionalidad</label></th>
				<td><form:select path="nacionalidad" items="${nacionalidad}" id="nacionalidad"/></td>
				<td><form:errors path="nacionalidad" class="errorsp" /></td>
			</tr>

			<tr>
				<th align="left"><label for="Foto perfil"><spring:message code="formfoto"></spring:message></label></th>
				<td><form:input type="file" name="foto" accept="image/*"
						id="foto" path="foto" /></td>
				<td><form:errors path="foto" class="errorsp" /></td>
			</tr>

			<tr>
				<td align="left"><input onclick="comprobarSiCampoEdadString()" type="submit" value="Sign Up"></td>
			</tr>

		</form:form>
	</table>
</body>
</html>