package sample.javaee.ejb.servlet;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sample.javaee.ejb.InterceptorBean;

@WebServlet("/interceptor")
public class InterceptorServlet extends HttpServlet {

    @EJB
    private InterceptorBean ejb;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        this.ejb.method();
    }
}
