package sample.javaee.ejb.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class DefaultInterceptor2 {
    
    @AroundInvoke
    public Object intercept(InvocationContext context) throws Exception {
        System.out.println("DefaultInterceptor2 before");
        Object result = context.proceed();
        System.out.println("DefaultInterceptor2 after");
        return result;
    }
}
