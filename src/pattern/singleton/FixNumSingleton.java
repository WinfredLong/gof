package pattern.singleton;

import java.util.ArrayList;

/**
 * @Description 固定数量的实例
 * @Author long yun cai
 * @Date 2020/5/18 15:13
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
     * 容纳所有实例
     */
    private static ArrayList<FixNumSingleton> fixNumSingletonArrayList = new ArrayList<>();

    static {
        for (int i = 0; i < MAX_NUMBER; i++) {

        }
    }


    private FixNumSingleton() {}

}
