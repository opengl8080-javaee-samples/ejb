package sample.javaee.ejb.servlet;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sample.javaee.ejb.StatelessSessionBean;

@WebServlet("/slsb")
public class StatelessSessionBeanServlet extends HttpServlet {
    
    @EJB
    private StatelessSessionBean ejb;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        this.ejb.method(this.hashCode(), this.ejb.hashCode());
    }
}