<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html><body>
<h2>Login</h2>

<%-- Esto es el elemento JSP que pide la guía --%>
<%
    String error = (String) request.getAttribute("error");
    if(error != null){
%>
    <p style="color:red"><%= error %></p>
<%
    }
%>

<form method="post" action="LoginServlet">
Usuario: <input type="text" name="usuario" value="admin"><br>
Clave: <input type="password" name="clave" value="123"><br>
<input type="submit" value="Entrar">
</form>

<a href="index.jsp">Volver al menú</a>
</body></html>