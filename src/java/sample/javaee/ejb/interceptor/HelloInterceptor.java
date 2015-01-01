package sample.javaee.ejb.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class HelloInterceptor {
    
    @AroundInvoke
    public Object intercept(InvocationContext context) throws Exception {
        System.out.println("HelloInterceptor before");
        Object result = context.proceed();
        System.out.println("HelloInterceptor after");
        return result;
    }
}
