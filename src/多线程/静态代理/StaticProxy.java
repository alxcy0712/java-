package 多线程.静态代理;

public class StaticProxy {

    public static void main(String[] args) {
        new Thread(()-> System.out.println("hello!")).start();
        Agency agency = new Agency(new Actual());
        agency.getThing();
    }
}

class Actual implements Thing{
    @Override
    public void getThing() {
        System.out.println("actual");
    }
}


class Agency implements Thing{
    //代理的是真实目标角色
    private Thing target;
    public Agency(Thing target){
        this.target = target;
    }


    @Override
    public void getThing() {
        before();
        this.target.getThing();
        after();
    }

    private void before() {
        System.out.println("before");
    }
    private void after() {
        System.out.println("after");
    }
}

interface Thing{
    void getThing();
}