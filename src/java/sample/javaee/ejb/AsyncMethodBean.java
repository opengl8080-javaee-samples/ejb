package sample.javaee.ejb;

import java.util.concurrent.Future;
import javax.ejb.AsyncResult;
import javax.ejb.Asynchronous;
import javax.ejb.Stateless;

@Stateless
public class AsyncMethodBean {
    
    @Asynchronous
    public Future<String> asyncMethod() {
        System.out.println("asyncMethod() thread=" + Thread.currentThread().getName());
        return new AsyncResult<>("asyncMethod result.");
    }
}
