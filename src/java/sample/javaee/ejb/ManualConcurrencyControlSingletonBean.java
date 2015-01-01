package sample.javaee.ejb;

import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Singleton;

@Singleton
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
public class ManualConcurrencyControlSingletonBean {
    
    synchronized public void method() {
        // ...
    }
}
