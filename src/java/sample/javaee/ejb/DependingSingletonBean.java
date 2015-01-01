package sample.javaee.ejb;

import javax.annotation.PostConstruct;
import javax.ejb.DependsOn;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@DependsOn({"DependedSingletonBean1", "singleton2"})
@Singleton
@Startup
public class DependingSingletonBean {
    
    @PostConstruct
    public void postConstruct() {
        System.out.println("DependingSingletonBean : post construct");
    }
}
