package sample.javaee.ejb.passivate;

import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Stateful;

@Stateful
public class Sfsb {
    
    private int count;
    private UnSerializableClass obj;
    
    public void method() {
        System.out.printf("Sfsb(%d) count=%d, obj=%s", this.hashCode(), ++this.count, this.obj);
        
        if (this.obj == null && 1 < this.count) {
            this.obj = new UnSerializableClass();
        }
    }
    
    @PrePassivate
    public void prePassivate() {
        System.out.printf("** pre passivate(%d) count=%d, obj=%s **", this.hashCode(), this.count, this.obj);
    }
    
    @PostActivate
    public void postActivate() {
        System.out.printf("## post passivate(%d) count=%d, obj=%s ##", this.hashCode(), this.count, this.obj);
    }
}
