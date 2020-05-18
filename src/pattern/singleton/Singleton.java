package pattern.singleton;

/**
 * @Description 单例模式通用代码
 * @Author long yun cai
 * @Date 2020/5/18 14:39
 */
public class Singleton {

    private static final Singleton SINGLETON = new Singleton();

    /**
     * 限制产生多个对象
     */
    private Singleton() {}

    /**
     * 通过该方法获得实例对象
     * @return Singleton
     */
    public static Singleton getInstance() {
        return SINGLETON;
    }

    public void doSomething() {
        System.out.println("只有一个实例");
    }

}
