package 多线程;



class MyRunnable implements Runnable{

    private int tickets = 100;
    public void print(){
        System.out.println(Thread.currentThread().getName()+"抢到了第"+this.tickets+"张票");
    }

    @Override
    public synchronized void run() {
        while(this.tickets-- > 0){
            this.print();

            //默认加一个时间间隔
            try {
                /**
                 * 这里wait方法和sleep方法都可以
                 * wait方法会释放锁 而sleep不会释放锁
                 */
                wait(30);
                //Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
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