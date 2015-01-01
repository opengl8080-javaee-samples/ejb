package sample.javaee.ejb.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class MyInterceptor {
    
    @AroundInvoke
    public Object intercept(InvocationContext context) throws Exception {
        System.out.println("before");
        Object result = context.proceed();
        System.out.println("after");
        return result;
    }
}
