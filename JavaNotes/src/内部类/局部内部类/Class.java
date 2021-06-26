package 内部类.局部内部类;

/**
 * Person类 Man类（外部类）
 * Man类中创建一个getWoman的方法 方法中定义Woman类 该类为局部内部类
 */
class Person{
    int age;
    Person(){
        this.age = 18;
    }
    public int getAge(){
        return this.age;
    }
}
class Man{
    Man(){

    }
    public Person getWoman(){
        class Woman extends Person{
            public void print(){
                System.out.println("woman's age is "+this.getAge());
            }
        }
        //调用局部内部类的方法print
        new Woman().print();
        return new Woman();
    }

    public void getSalary(int salary){
        class Salary{
            public void print(){
                //salary++; 错误   内部类中访问的 局部变量 必须为final类型或不在代码中修改值
                System.out.println("the salary is "+salary);
            }
        }
        new Salary().print();
    }
}

public class Class {
    public static void main(String[] args) {
        Man man = new Man();
        man.getWoman();
        man.getSalary(100);
    }
}
