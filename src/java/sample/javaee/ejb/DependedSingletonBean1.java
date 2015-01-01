package sample.javaee.ejb;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

@Singleton
public class DependedSingletonBean1 {
    
    @PostConstruct
    public void postConstruct() {
        System.out.println("DependedSingletonBean1 : post construct");
    }
}
