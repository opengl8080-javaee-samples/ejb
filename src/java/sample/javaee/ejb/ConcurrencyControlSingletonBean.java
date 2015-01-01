package sample.javaee.ejb;

import javax.ejb.AccessTimeout;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;

@Singleton
public class ConcurrencyControlSingletonBean {
    
    public void defaultControl() {
        this.process("defaultControl");
    }
    
    @Lock(LockType.READ)
    public void readControl() {
        this.process("readControl");
    }
    
    @AccessTimeout(400)
    public void timeout() {
        this.process("timeout");
    }
    
    private void process(String method) {
        log(method, "before");
        this.sleep();
        log(method, "after");
    }
    
    private void log(String method, String tag) {
        System.out.printf("%s() %s [Thread : %s]", method, tag, Thread.currentThread().getName());
    }
    
    private void sleep() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
