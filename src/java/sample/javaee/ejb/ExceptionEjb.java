package sample.javaee.ejb;

import javax.ejb.Stateless;

@Stateless
public class ExceptionEjb {
    
    public void throwException() throws Exception {
        throw new Exception("test");
    }
    
    public void throwRuntimeException() {
        throw new RuntimeException("test");
    }
}
