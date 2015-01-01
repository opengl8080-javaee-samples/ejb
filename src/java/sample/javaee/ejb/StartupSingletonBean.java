package sample.javaee.ejb;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class StartupSingletonBean {
    
    @PostConstruct
    public void postConstruct() {
        System.out.println("StartupSingletonBean : post construct");
    }
}
