package 多线程;

class MyThread implements Runnable{
    private String name;
    MyThread(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("线程"+this.name+"运行： i = "+i);
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("A");
        MyThread myThread2 = new MyThread("B");
        new Thread(myThread1).start();
        new Thread(myThread2).start();
    }
}
