package 多线程;

import java.util.concurrent.*;

class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("hello  "+Thread.currentThread().getName());
        return Thread.currentThread().hashCode();
    }
}

public class CallableDemo {
    public static void main(String[] args) {
        MyCallable t1 = new MyCallable();
        MyCallable t2 = new MyCallable();
        MyCallable t3 = new MyCallable();
        // 创建执行服务
        ExecutorService ser = Executors.newFixedThreadPool(3);
        //提交执行
        Future<Integer> r1 = ser.submit(t1);
        Future<Integer> r2 = ser.submit(t2);
        Future<Integer> r3 = ser.submit(t3);
        // 获取结果
        try {
            Integer integer1 = r1.get();
            Integer integer2 = r2.get();
            Integer integer3 = r3.get();
            System.out.println(integer1 + " "+integer2+" "+integer3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        ser.shutdown();
    }
}
