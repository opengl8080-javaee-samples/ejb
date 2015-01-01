package sample.javaee.ejb;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

@Singleton(name="singleton2")
public class DependedSingletonBean2 {
    
    @PostConstruct
    public void postConstruct() {
        System.out.println("DependedSingletonBean2 : post construct");
    }
}
