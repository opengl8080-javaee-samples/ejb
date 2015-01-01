package sample.javaee.ejb.servlet;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sample.javaee.ejb.ExcludeDefaultInterceptorEjb;

@WebServlet("/interceptor/exclude")
public class ExcludeDefaultInterceptorServlet extends HttpServlet {
    
    @EJB
    private ExcludeDefaultInterceptorEjb ejb;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        this.ejb.method();
    }
}
