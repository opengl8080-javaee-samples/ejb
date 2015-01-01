package sample.javaee.ejb;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class EjbClient {
    
    @EJB
    private StatefulSessionBean sfsb;
    
    public void method() {
        this.sfsb.countUp(this.hashCode());
    }

    public void remove() {
        this.sfsb.remove();
    }
}
