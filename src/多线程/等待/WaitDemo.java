package 多线程.等待;

class ThreadA extends Thread{
    public ThreadA(String name){
        super(name);
    }
    public void run(){
        synchronized (this){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() +" call notify()");
            this.notify();
        }
    }
}


public class WaitDemo {

    public static void main(String[] args) {
        ThreadA t1 = new ThreadA("t1");
        synchronized (t1){
            try{
                System.out.println(Thread.currentThread().getName()+" start t1");
                t1.start();
                System.out.println(Thread.currentThread().getName()+" wait()");
                t1.wait();
                System.out.println(Thread.currentThread().getName()+" continue");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
