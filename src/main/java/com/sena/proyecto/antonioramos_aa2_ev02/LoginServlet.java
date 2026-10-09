package com.sena.proyecto.antonioramos_aa2_ev02;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String usuario = request.getParameter("usuario");
        String clave = request.getParameter("clave");

        if ("admin".equals(usuario) && "1234".equals(clave)) {
            HttpSession sesion = request.getSession();
            sesion.setAttribute("usuario", usuario);
            response.sendRedirect("dashboard.jsp");
        } else {
            response.sendRedirect("login.jsp?error=1");
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("login.jsp");
    }
}