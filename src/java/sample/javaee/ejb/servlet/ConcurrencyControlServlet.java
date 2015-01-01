package sample.javaee.ejb.servlet;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sample.javaee.ejb.ConcurrencyControlSingletonBean;

@WebServlet("/singleton/concurrency/*")
public class ConcurrencyControlServlet extends HttpServlet {
    
    @EJB
    private ConcurrencyControlSingletonBean ejb;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        String path = req.getRequestURI();
        
        if (path.endsWith("/read")) {
            this.ejb.readControl();
        } else if (path.endsWith("/timeout")) {
            this.ejb.timeout();
        } else {
            this.ejb.defaultControl();
        }
    }
}
