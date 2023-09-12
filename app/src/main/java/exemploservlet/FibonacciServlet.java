package exemploservlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

import jakarta.servlet.ServletException;

@WebServlet(name = "fibonacciServlet", urlPatterns = "fibonacci")
public class FibonacciServlet extends HttpServlet {
    public void doGet(
        HttpServletRequest request,
        HttpServletResponse response)
        throws ServletException, IOException {
            int[] sequencia = new int[10];
            sequencia[0] = 1;
            sequencia[1] = 1;
            for(int pos = 2;pos < sequencia.length;pos++) {
                sequencia[pos] = sequencia[pos - 1] + sequencia[pos - 2];
            }
            request.setAttribute("resposta", sequencia );
            request.getRequestDispatcher("/fibo.jsp").forward(request, response);
        }
    
    
}
