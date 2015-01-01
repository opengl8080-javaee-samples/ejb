package sample.javaee.ejb.passivate;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;

@SessionScoped
public class EjbClient implements Serializable {
    
    @EJB
    private Sfsb ejb;
    
    public void method() {
        this.ejb.method();
    }
}
