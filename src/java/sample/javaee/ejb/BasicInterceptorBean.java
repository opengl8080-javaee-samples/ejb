package sample.javaee.ejb;

import javax.ejb.Stateless;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

@Stateless
public class BasicInterceptorBean {
    
    public void method1() {
        System.out.println("method1");
        this.method2();
    }
    
    public void method2() {
        System.out.println("method2");
    }
    
    @AroundInvoke
    private Object intercept(InvocationContext context) throws Exception {
        System.out.println("before");
        Object result = context.proceed();
        System.out.println("after");
        return result;
    }
}
