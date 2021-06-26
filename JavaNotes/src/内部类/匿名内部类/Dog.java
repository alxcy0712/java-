package 内部类.匿名内部类;


public class Dog {

    //在外部类方法中的参数必须为 final类型 或者不能更改
    public static Animal getInnerInstance(String words,int age) {
        //用new 类方式构建匿名内部类
        /**lambda表达式   return () -> System.out.println("animal can speak");  */

        return new Animal() {
            @Override
            public void speak() {
                //words="aaa";  错误 words age必须不变
                System.out.println(words);
            }

            @Override
            public void getAge() {
                System.out.println("the age is "+age);
            }
        };

    }
    //还有一种类似Android里面的addButtonListener()中就用到了匿名内部类


    public static void main(String[] args) {
        Dog.getInnerInstance("hello world",10).speak();
        Dog.getInnerInstance("hello world",10).getAge();
    }
}
