package 多线程.静态代理;

/**
 * 在这个实例中 cinema是代理项
 *            movie是事件接口
 *            moviewithoutad是真实项
 * 在movie事件接口中定义play方法 在moviewithoutad真实项中实现方法play 在cinema代理项中扩充方法play
 * 在代理项中定义一个真实项 在代理项的方法中完成对真实项方法的调用
 *
 * 作用：可以扩充原来的真实项 也可另外新建方法，与真实项并不冲突
 */
public class Cinema implements Movie{

    //在代理项中定义一个真实项
    MovieWithoutAd movieWithoutAd;

    //构造方法 参数为真实项
    Cinema(MovieWithoutAd movieWithoutAd){
        this.movieWithoutAd = movieWithoutAd;
    }


    //在重载函数play中完成对真实项方法play的扩充
    @Override
    public void play() {
        System.out.println("ad before movie");
        //调用真实项中的方法
        this.movieWithoutAd.play();
        System.out.println("all over");
    }

    public static void main(String[] args) {
        //调用代理项 代理项内的构造方法是new一个真实项
        Cinema cinema = new Cinema(new MovieWithoutAd("肖申克的救赎"));
        cinema.play();
    }
}

//真实项
class MovieWithoutAd implements Movie{
    private String name;
    MovieWithoutAd(String name){
        this.name = name;
    }
    @Override
    public void play() {
        System.out.println("the movie 《"+name+"》 is on ...");
    }
}

/**
 * 定义一个接口Movie 定义方法play
 */
interface Movie{
    void play();
}
