package pattern.singleton;

/**
 * @Description 客户端
 * @Author long yun cai
 * @Date 2020/5/18 14:43
 */
public class Client {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();

        for (int i = 0; i < 5; i++) {
            FixNumSingleton fixNumSingleton = FixNumSingleton.getInstance();
            fixNumSingleton.doSomething();
        }

    }

}
