package sample.javaee.ejb.servlet;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sample.javaee.ejb.EjbClient;

@WebServlet("/sfsb/*")
public class StatefulSessionBeanServlet extends HttpServlet {
    
    @EJB
    private EjbClient client;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        String path = req.getRequestURI();
        
        if (path.endsWith("/sfsb")) {
            this.client.method();
        } else if (path.endsWith("/sfsb/remove")) {
            this.client.remove();
        }
    }
}