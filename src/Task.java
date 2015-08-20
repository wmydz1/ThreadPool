import java.util.concurrent.TimeUnit;

/**
 * Created by samchen on 8/20/15.
 */
public class Task implements Runnable {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Long duration = (long) (Math.random() * 10);
            System.out.println("Doing a task during : "+name);
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
