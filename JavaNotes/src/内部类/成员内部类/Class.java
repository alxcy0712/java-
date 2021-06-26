package 内部类.成员内部类;

/**
 * 成员内部类 就是在外部类中另外创建一个类
 * 在下面的实例中 Circle是外部类 Calculate是成员内部类
 */
class Circle{
    private int radius;
    Circle(){
        this.radius = 10;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     * 获取到成员内部类（采用第一种构造方法）
     */
    public Calculate getCalculateInstance(){
        return new Calculate();
    }

    /**
     * 获取信息 信息都是成员内部类中的方法
     */
    public void outputInfo(){
        this.getCalculateInstance().calculateArea();
        this.getCalculateInstance().calculateVolume();
    }


    /**
     * 创建成员内部类
     * 成员内部类是依托外部类实现的
     */
    class Calculate{
        private int height;
        Calculate(){
            this.height = 10;
        }
        public void setHeight(int height) {
            this.height = height;
        }

        /**
         * 内部类访问外部类的方法 外部类.this.外部类中的方法名
         */
        public void setRadius(int radius){
            Circle.this.setRadius(radius);
        }

        /**
         * 成员内部类中也可以调用外部类中的方法和参数
         */
        public void calculateArea(){
            //Circle.this.radius 表示饮用的是外部类的radius 如果内部类中存在同名的属性 radius调用的是内部类
            System.out.println("the area is "+Circle.this.radius*Circle.this.radius*Math.PI);
        }
        public void calculateVolume(){
            System.out.println("the volume is "+radius*radius*Math.PI*height);
        }
    }
}



public class Class {
    public static void main(String[] args) {
        System.out.println("———————————高度10和半径10后———————————");
        //创建一个外部类cicle
        Circle circle = new Circle();
        circle.outputInfo();

        System.out.println("————————改变高度100和半径100后————————");

        //创建一个内部类calculate（采用第二种构造方法）
        Circle.Calculate calculate = circle.new Calculate();
        calculate.setHeight(100);
        calculate.setRadius(100);
        calculate.calculateArea();
        calculate.calculateVolume();

    }
}
