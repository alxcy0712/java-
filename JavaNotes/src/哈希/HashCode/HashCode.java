package 哈希.HashCode;


import java.util.Objects;

class Test{
    private int a;
    Test(){
        a = 0;
    }
    Test(int number){
        this.a = number;
    }

    @Override
    public boolean equals(Object o) {
        //两个对象有相同的地址 返回true
        if (this == o) {
            return true;
        }
        //两个对象其中一个是空 或者 两个class对象不一样 返回false
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        //如果不符合上述两种情况 返回的是两个对象的value值
        Test test = (Test) o;
        return a == test.a;
    }
    @Override
    public int hashCode() {
        // 在Objects类源码中可以得到该值 31*values（values=1）+ a
        return Objects.hash(a);
    }
}

public class HashCode {
    public static void main(String[] args) {
        Test test1 = new Test(10);
        Test test2 = new Test(10);

        //test1 和 test2 两个对象构造方法中的参数一致，得到的hashCode也相同
        System.out.println("test1's hashcode is "+test1.hashCode());
        System.out.println("test2's hashcode is "+test2.hashCode());
        //重写equals方法 返回的是两个对象的值比较
        System.out.println(test1.equals(test2));
        //虽然两个对象在哈希表中的哈希码相同 但是地址不一样 返回false
        System.out.println(test1 == test2);
    }
}
