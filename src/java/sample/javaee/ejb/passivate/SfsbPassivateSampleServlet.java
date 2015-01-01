package sample.javaee.ejb.passivate;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sfsb-passivate")
public class SfsbPassivateSampleServlet extends HttpServlet {
    
    @Inject
    private EjbClient client;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        this.client.method();
    }
}
