package sample.javaee.ejb;

import javax.ejb.Stateless;

@Stateless
public class HelloEjb {
    
    public void hello() {
        System.out.println("Hello EJB!!");
    }
}
