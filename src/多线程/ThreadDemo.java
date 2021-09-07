package 多线程;

class Thread1 extends Thread{
    @Override
    public void run() {
        System.out.println("this is thread");
    }
}

public class ThreadDemo {

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.start();
    }
}
