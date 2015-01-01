package sample.javaee.ejb;

import javax.ejb.Stateless;
import javax.interceptor.ExcludeDefaultInterceptors;

@Stateless
public class ExcludeDefaultInterceptorEjb {
    
    @ExcludeDefaultInterceptors
    public void method() {
        System.out.println("ExcludeDefaultInterceptorEjb.method()");
    }
}
