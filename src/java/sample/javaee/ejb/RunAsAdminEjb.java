package sample.javaee.ejb;

import javax.annotation.security.RunAs;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
@RunAs("admin_role")
public class RunAsAdminEjb {
    
    @EJB
    private SecureEjb secureEjb;
    
    public void asAdmin() {
        this.secureEjb.forAdminMethod();
    }
}
