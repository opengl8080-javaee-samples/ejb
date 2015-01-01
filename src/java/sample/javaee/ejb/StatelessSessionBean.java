package sample.javaee.ejb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;

@Stateless
public class StatelessSessionBean {
    
    @PostConstruct
    public void postConstruct() {
        System.out.println("StatelessSessionBean : post construct");
    }
    
    public void method(int servletHash, int servletEjbHash) {
        System.out.printf("servlet.hash=%d, servlet.ejb.hash=%d, slsb.hash=%d", servletHash, servletEjbHash, this.hashCode());
    }
    
    @PreDestroy
    public void preDestroy() {
        System.out.println("StatelessSessionBean : pre destroy");
    }
}
