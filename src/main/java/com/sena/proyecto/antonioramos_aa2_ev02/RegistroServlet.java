package com.sena.proyecto.antonioramos_aa2_ev02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistroServlet")
public class RegistroServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        System.out.println("Nuevo registro: " + nombre);

        List<String> lista = (List<String>) getServletContext().getAttribute("listaUsuarios");
        if (lista == null) {
            lista = new ArrayList<>();
        }
        if (nombre != null && !nombre.trim().isEmpty()) {
            lista.add(nombre);
        }
        getServletContext().setAttribute("listaUsuarios", lista);

        response.sendRedirect("registro.jsp");
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.sendRedirect("registro.jsp");
    }
}