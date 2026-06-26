package br.com.senac.ExercicioDois;

import br.com.senac.HelloServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/saudacao")
public class saudacao extends HelloServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset+UTF-8");
        String nome = req.getParameter("nome");
        if(nome == null) {
            resp.getWriter().println("<h1>Visitante</h1>");
        }else if (nome.length()<2) {
            resp.getWriter().println("<h1 style=\"color:red\">Nome deve conter pelo menos 2 caracteres</h1>");
        } else {
            resp.getWriter().println("<h1> Olá " + nome + " Seja Muito Bem vinda!</h1> ");

        }





    }
}
