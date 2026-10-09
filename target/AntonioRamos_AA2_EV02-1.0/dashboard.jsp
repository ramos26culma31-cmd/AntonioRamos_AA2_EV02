<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html><body>
<h2>Dashboard</h2>
<h3>Bienvenido: <hr>
<h3>Usuarios Registrados (EV02):</h3>
<ul>
<%
java.util.List<String> lista = (java.util.List<String>) application.getAttribute("listaUsuarios");
if (lista != null) {
  for (String u : lista) {
%>
  <li><%= u %></li>
<%
  }
} else {
%>
  <li>No hay usuarios aún</li>
<% } %>
</ul>
<a href="index.jsp">Volver al Menú</a>