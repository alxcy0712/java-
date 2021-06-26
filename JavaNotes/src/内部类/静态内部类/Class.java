package 内部类.静态内部类;

/**
 *  静态内部类 Inner的构造方法是static
 */
class Outer{
    private int value = 1;
    private static int valueStatic = 2;
    static{
        System.out.println("this is outer static");
    }
    {
        System.out.println("this is outer common");
    }
    public void print(){
        System.out.println("this is outer print");
    }
    public static void printStatic(){
        System.out.println("this is outer static print");
    }

    public static class Inner{
        private int valueInner = 3;
        private static int valueStaticInner = 4;
        static{
            System.out.println("this is inner static");
        }
        {
            System.out.println("this is inner common");
        }
        public void printInner(){
            System.out.println("this is inner print");
        }
        public static void printStaticInner(){
            System.out.println("this is inner static print");
        }
    }

}



public class Class {
    public static void main(String[] args) {
        //此时调用外部类的静态方法（外部类.方法）
        Outer.printStatic();
        //构造类之后就可以访问非静态方法
        Outer outer = new Outer();
        outer.print();

        //此时访问的是静态类的静态方法（外部类.内部类.方法） 只能访问静态方法
        //同时也侧面说明静态内部类可以 不依赖于 外部类
        Outer.Inner.printStaticInner();
        //构造类之后就可以访问非静态方法
        Outer.Inner inner = new Outer.Inner();
        inner.printInner();

    }
}
