<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Modulos</title>
</head>
<body>
	<br>
	<h3 style="text-align:center">MODULOS</h3>
	<br>
	<table class="table" width="50%">
		<tr>
			<th>
				Nome
			</th>
			<th>
				Titular
			</th>
			<th>
				Auxiliar
			</th>
			<th>
				Data de inauguração
			</th>
		</tr>
		
		<c:forEach var="modulo" items="${modulos}">
				<tr>
					<td><c:out value="${modulo.nome}"></c:out>  </td>
					<td><c:out value="${modulo.titular}"></c:out>  </td>
					<td><c:out value="${modulo.auxiliar}"></c:out>  </td>
					<td><fmt:formatDate value="${modulo.dtInauguracao}" pattern="dd/MM/yyyy"/> </td>
					<td><button class="danger">Editar</button></td>
					<td><button class="danger">Excluir</button></td>
				</tr>
		</c:forEach>
	</table>
	
	<div>
		<button style="align-text:right" class="danger">Novo</button>
	</div>
</body>
</html>