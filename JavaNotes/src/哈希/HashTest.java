package 哈希;

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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return a == test.a;
    }
    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}

public class HashTest {
    public static void main(String[] args) {
        Test test1 = new Test(10);
        Test test2 = new Test(10);

        System.out.println("test1's hashcode is "+test1.hashCode());
        System.out.println("test2's hashcode is "+test2.hashCode());

        System.out.println(test1.equals(test2));
    }
}
