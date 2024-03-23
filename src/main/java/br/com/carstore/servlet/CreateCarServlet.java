package br.com.carstore.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-car")
public class CreateCarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String carMod = request.getParameter("carMod");
        String carName = request.getParameter("carName");

        System.out.println("O modelo do carro é:"  + carMod);
        System.out.println("O modelo do carro é:"  + carName);

        request.getRequestDispatcher("index.html").forward(request, response);




    }

}