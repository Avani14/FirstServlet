package com.bridgelabz.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.System.out;

@WebServlet(
        description = "Login Servlet",
        urlPatterns = {"/LoginServlet"},
        initParams = {
                @WebInitParam(name="user",value="Avani"),
                @WebInitParam(name="password",value = "Password@1234")
        }
)
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("user");
        String password = req.getParameter("password");
        String userID = getServletConfig().getInitParameter("user");
        String pass = getServletConfig().getInitParameter("password");
        if(userID.equals(user) && pass.equals(password)){
            req.setAttribute("user",user);
            out.println("Success");
            req.getRequestDispatcher("Success.jsp").forward(req,resp);
        }
        else {
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/Login.html");
            PrintWriter printWriter = resp.getWriter();
            out.println("<h3>You have entered incorrect information...</h3>");
            requestDispatcher.include(req,resp);
        }
    }
}
