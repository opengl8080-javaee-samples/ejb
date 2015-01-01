package sample.javaee.ejb;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.ScheduleExpression;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Timeout;
import javax.ejb.TimerConfig;
import javax.ejb.TimerService;

@Singleton
@Startup
public class TimerEjb {
    
    @Resource
    private TimerService timer;
    
    @PostConstruct
    public void registerTimer() {
        ScheduleExpression schedule = new ScheduleExpression().hour("*").minute("*").second("*/10");
        this.timer.createCalendarTimer(schedule, new TimerConfig(null, false));
    }
    
    @Timeout
    private void timeout() {
        System.out.printf("%s : TimerEjb.timeout()", this.now());
    }
    
    private String now() {
        SimpleDateFormat format = new SimpleDateFormat("mm:ss");
        return format.format(new Date());
    }
}
