import java.util.Calendar;

public class Task implements Runnable {
    private int num;

    public Task(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.print("Thread:" + num + "->");
        System.out.print("Current Time:" + Calendar.getInstance().get(Calendar.HOUR) + ":");
        System.out.print(Calendar.getInstance().get(Calendar.MINUTE) + ":");
        System.out.println(Calendar.getInstance().get(Calendar.SECOND));
    }

}
