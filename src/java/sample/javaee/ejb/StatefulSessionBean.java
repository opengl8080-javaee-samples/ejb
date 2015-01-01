package sample.javaee.ejb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Remove;
import javax.ejb.Stateful;

@Stateful
public class StatefulSessionBean {
    
    private int count;
    
    public void countUp(int clientHash) {
        System.out.printf("clientHash=%d, count=%d", clientHash, ++this.count);
    }
    
    @PostConstruct
    public void postConstruct() {
        System.out.println("StatefulSessionBean : post construct");
    }
    
    @PreDestroy
    public void preDestroy() {
        System.out.println("StatefulSessionBean : pre destroy");
    }
    
    @Remove
    public void remove() {
        System.out.println("remove SatefulSessionBean");
    }
    
    @PrePassivate
    public void prePassivate() {
        System.out.println("pre passivate");
    }
    
    @PostActivate
    public void postActivate() {
        System.out.println("post activate");
    }
}
