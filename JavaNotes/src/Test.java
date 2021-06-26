public class Test {


    public static void main(String[] args) {
        T t = new T(){
            int a;
            @Override
            public void print() {
                a++;
                System.out.println("this is print2");
            }
        };

        t.print();
    }
}
abstract class T{
    private int a;
    private int b;
    T(){

    }
    public void print(){
        System.out.println("this is print");
    }
}