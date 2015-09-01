<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${persona.nombre} profile</title>
</head>
<body>

	<table border="2px">
		<tr>
			<th>Nombre</th>
			<th>Edad</th>
			<th>DNI</th>
			<th>Descripción</th>
			<th>Imágen de perfil</th>
		</tr>
		<tr>
			<td>${persona.nombre}</td>
			<td>${persona.edad}</td>
			<td>${persona.dni}</td>
			<td>${persona.descripcion}</td>
			<td><img alt="fotoPerfil" src="images/${persona.photoOriginalName}" width="150px" height="150px"></td>
		</tr>
	</table>

</body>
</html>