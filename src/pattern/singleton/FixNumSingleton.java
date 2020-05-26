package pattern.singleton;

import java.util.ArrayList;
import java.util.Random;

/**
 * 固定数量的实例
 * @author long yun cai
 * @date 2020/5/18 15:13
 */
public class FixNumSingleton {

    /**
     * 最大数量
     */
    private static final int MAX_NUMBER = 2;

    /**
     * 每个对象的私有属性
     */
    private static ArrayList<String> nameList = new ArrayList<>();

    /**
     * 当前序号
     */
    private static int countNumOfFixNumSingleton = 0;

    /**
     * 容纳所有实例
     */
    private static ArrayList<FixNumSingleton> fixNumSingletonArrayList = new ArrayList<>();

    // 产生所有的实例
    static {
        for (int i = 0; i < MAX_NUMBER; i++) {
            fixNumSingletonArrayList.add(new FixNumSingleton("固定实例" + (i + 1)));
        }
    }

    /**
     * 随机获取一个实例
     * @return FixNumSingleton
     */
    public static FixNumSingleton getInstance() {
        Random random = new Random();
        countNumOfFixNumSingleton = random.nextInt(MAX_NUMBER);
        return fixNumSingletonArrayList.get(countNumOfFixNumSingleton);
    }

    /**
     * 私有构造方法
     */
    private FixNumSingleton() {}

    /**
     * 创建指定实例
     * @param name 名称
     */
    private FixNumSingleton(String name) {
        nameList.add(name);
    }

    /**
     * 公有方法
     */
    public void doSomething() {
        System.out.println(nameList.get(countNumOfFixNumSingleton));
    }

}
