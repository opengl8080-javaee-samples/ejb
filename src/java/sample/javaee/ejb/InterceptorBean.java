package sample.javaee.ejb;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import sample.javaee.ejb.interceptor.MyInterceptor;

@Stateless
public class InterceptorBean {
    
    @Interceptors(MyInterceptor.class)
    public void method() {
        System.out.println("InterceptorBean.method()");
    }
}
