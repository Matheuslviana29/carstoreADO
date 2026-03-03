package br.com.carstore.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/create-car")
public class CreateCarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String carName = request.getParameter("car-name");
        System.out.println("Nome do carro: " + carName);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        String jsonResponse = "{\"name\": \"" + carName + "\"}";

        PrintWriter out = response.getWriter();
        out.print(jsonResponse);
        out.flush();

    }
}