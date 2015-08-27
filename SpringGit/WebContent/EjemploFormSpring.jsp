<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ejemplo simple form Spring --> EjemploFormSpring.java</title>
</head>
<body>

	<h1>POR GET</h1>
	<form method="GET" action="/SpringGit/form">
		Nombre: <input name="nombre" type="text"> <input type="submit"
			value="enviar">
	</form>


	<h1>POR POST</h1>
	<form method="post" action="/SpringGit/form">
		Nombre: <input name="nombre" type="text"> <input type="submit"
			value="enviar">
	</form>


	<h1>CONSTRUIR PERSONA</h1>
	<form method="POST" action="/SpringGit/form">
		Nombre: <input name="nombre" type="text">
		Edad: <input name="edad" type="text">
		Descripción <input name="descripcion" type="text">
		 <input type="submit" value="enviar">
	</form>

</body>
</html>