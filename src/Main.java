import java.util.Calendar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);
        System.out.print("Current Time:" + Calendar.getInstance().get(Calendar.HOUR) + ":");
        System.out.print(Calendar.getInstance().get(Calendar.MINUTE) + ":");
        System.out.println(Calendar.getInstance().get(Calendar.SECOND));

        for (int i = 0; i < 5; i++) {

            scheduledExecutorService.schedule(new Task(i), i, TimeUnit.SECONDS);
        }

        scheduledExecutorService.shutdown();
    }
}
