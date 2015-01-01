package sample.javaee.ejb.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class DefaultInterceptor {
    
    @AroundInvoke
    public Object intercept(InvocationContext context) throws Exception {
        System.out.println("DefaultInterceptor before");
        Object result = context.proceed();
        System.out.println("DefaultInterceptor after");
        return result;
    }
}
