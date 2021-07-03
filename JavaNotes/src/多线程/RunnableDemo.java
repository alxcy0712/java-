package 多线程;



class MyRunnable implements Runnable{

    private int tickets = 100;
    @Override
    public synchronized void run() {
        while(true){
            if(tickets<=0) {
                break;
            }

            if(tickets == 1){
                System.out.println(Thread.currentThread().getName()+"抢到了最后"+this.tickets--+"张票");
            }else{
                System.out.println(Thread.currentThread().getName()+"抢到了第"+this.tickets--+"张票");
            }

        }
    }
}

public class RunnableDemo {

    public static void main(String[] args) {
        MyRunnable myThread1 = new MyRunnable();
        new Thread(myThread1,"A").start();
        new Thread(myThread1,"B").start();
        new Thread(myThread1,"C").start();
        new Thread(myThread1,"D").start();
        new Thread(myThread1,"E").start();

    }
}