package sample.javaee.ejb.passivate;

public class UnSerializableClass {

    @Override
    public String toString() {
        return "UnSerializableClass:" + this.hashCode();
    }
}
