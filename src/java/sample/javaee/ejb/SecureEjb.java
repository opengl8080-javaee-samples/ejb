package sample.javaee.ejb;

import java.security.Principal;
import javax.annotation.Resource;
import javax.annotation.security.DenyAll;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

@Stateless
public class SecureEjb {
    
    @Resource
    private SessionContext context;
    
    @RolesAllowed({"user_role", "admin_role"})
    public void forUserMethod() {
        System.out.println("forUserMethod()");
    }
    
    @RolesAllowed("admin_role")
    public void forAdminMethod() {
        System.out.println("forAdminMethod()");
    }
    
    @PermitAll
    public void permitAll() {
        System.out.println("permitAll()");
    }
    
    @DenyAll
    public void denyAll() {
        System.out.println("denyAll()");
    }
    
    public void checkRole() {
        String name = this.context.getCallerPrincipal().getName();
        
        if (this.context.isCallerInRole("user_role")) {
            System.out.println(name + " has 'user_role'");
        }
        
        if (this.context.isCallerInRole("admin_role")) {
            System.out.println(name + " has 'admin_role'");
        }
    }
}
