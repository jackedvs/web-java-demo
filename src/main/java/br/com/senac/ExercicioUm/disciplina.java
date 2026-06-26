package br.com.senac.ExercicioUm;

import br.com.senac.HelloServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/disciplina")
public class disciplina extends HelloServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        resp.getWriter().println("<h1>Desenvolvimento Web com Java!</h1>");
        String versaoJava = System.getProperty("java.version");
        resp.getWriter().println("<p><strong>Versao do Java no Servidor:</strong>" + versaoJava + "</p>");
        java.time.LocalDate dataAtual = java.time.LocalDate.now();
        resp.getWriter().println("<p><strong>Data atual:</strong> " + dataAtual + " </p>");


    }
}
