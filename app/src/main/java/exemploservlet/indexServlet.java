package exemploservlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.net.http.HttpRequest;
import java.rmi.ServerException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "IndexServlet", urlPatterns = "/")
public class indexServlet extends HttpServlet {
    public void doGet(
        HttpServletRequest request,
        HttpServletResponse response) 
        throws ServerException, IOException {
            response.getWriter().print("Olá Servlet");

    }
    
}
