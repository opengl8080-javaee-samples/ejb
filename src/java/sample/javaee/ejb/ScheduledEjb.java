package sample.javaee.ejb;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.ejb.Schedule;
import javax.ejb.Stateless;

@Stateless
public class ScheduledEjb {
    
    @Schedule(second = "30/10", minute = "*", hour = "*", persistent = false)
    public void process() {
        System.out.printf("%s : ScheduledEjb.process()", this.now());
    }

    private String now() {
        SimpleDateFormat format = new SimpleDateFormat("mm:ss");
        return format.format(new Date());
    }
}
