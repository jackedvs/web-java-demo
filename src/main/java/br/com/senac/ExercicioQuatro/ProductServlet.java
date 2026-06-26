package br.com.senac.ExercicioQuatro;

import br.com.senac.HelloServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/produto/*")
public class ProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String pathInfo = req.getPathInfo();

        if (pathInfo != null && pathInfo.length() > 1) {
            resp.getWriter().println("<h1>Você está vendo os detalhes do produto: " + pathInfo.substring(1) + "</h1>");
        } else {
            resp.getWriter().println("<h1>Produto não informado</h1>");
        }
    }
}
