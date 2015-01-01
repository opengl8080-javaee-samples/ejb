package sample.javaee.ejb.servlet;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sample.javaee.ejb.RunAsAdminEjb;
import sample.javaee.ejb.SecureEjb;

@WebServlet("/secure/*")
public class SecureServlet extends HttpServlet {
    
    @EJB
    private SecureEjb ejb;
    
    @EJB
    private RunAsAdminEjb runAsAdminEjb;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        String path = req.getRequestURI();
        
        if (path.endsWith("/user")) {
            this.ejb.forUserMethod();
        } else if (path.endsWith("/admin")) {
            this.ejb.forAdminMethod();
        } else if (path.endsWith("/permit-all")) {
            this.ejb.permitAll();
        } else if (path.endsWith("/deny-all")) {
            this.ejb.denyAll();
        } else if (path.endsWith("/run-as")) {
            this.runAsAdminEjb.asAdmin();
        } else if (path.endsWith("/check-role")) {
            this.ejb.checkRole();
        }
    }
}
