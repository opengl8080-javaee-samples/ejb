package sample.javaee.ejb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;

@Singleton
public class SingletonBean {
    
    public void method() {
        System.out.println("SingletonBean : hash=" + this.hashCode());
    }
    
    @PostConstruct
    public void postConstruct() {
        System.out.println("SingletonBean : post construct");
    }
    
    @PreDestroy
    public void preDestroy() {
        System.out.println("SingletonBean : pre destroy");
    }
}
