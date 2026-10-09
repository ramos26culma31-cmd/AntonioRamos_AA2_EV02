<%@page import="java.util.List" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html><body>
<h2>Registro de Usuarios</h2>

<form method="post" action="RegistroServlet">
Nombre: <input type="text" name="nombre">
<input type="submit" value="Registrar">
</form>

<hr>
<h3>Usuarios guardados:</h3>
<%
    List<String> lista = (List<String>) application.getAttribute("listaUsuarios");
    if(lista != null){
        for(String nombre : lista){
%>
            <p>- <%= nombre %></p>
<%
        }
    }
%>
<a href="index.jsp">Volver</a>
</body></html>