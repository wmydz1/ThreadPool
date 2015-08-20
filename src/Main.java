import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {

    public static void main(String[] args) {

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            Task task = new Task("Task " + i);
            System.out.println("A new task has ben added :" + task.getName());
            executor.execute(task);
        }
        executor.shutdown();

    }
}
