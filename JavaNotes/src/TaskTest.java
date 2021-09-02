import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskTest {
    private static final ExecutorService pool = Executors.newFixedThreadPool(5);// 线程池
    public static final TaskTest me = new TaskTest();
    public final int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        me.start();
    }

    private void start() {
        pool.execute(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        for (int i = 0; i < arr.length; i++) {
                            if (1 == arr[i]) {
                                System.out.println("start!");
                                Thread.sleep(1*1000L);
                            }
                            if (6 == arr[i]) {
                                System.out.println("stop!");
                                Thread.sleep(5*1000L);
                            }
                            System.out.println(arr[i]);
                            if (9 == arr[i]) {
                                System.out.println("end!");
                                Thread.sleep(5*1000L);
                            }
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}

