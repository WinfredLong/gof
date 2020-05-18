package principle.lsp.param;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 子类
 * @Author long yun cai
 * @Date 2020/5/18 9:54
 */
public class Son extends Father {

    /**
     * 子类前置参数范围比父类大，子类不会被执行，符合里氏替换原则
     * 子类后置参数范围应小于等于父类
     * @param map Map
     * @return HashMap
     */
    public HashMap doSomething(Map map) {
        System.out.println("子类执行...");
        return new HashMap(16);
    }
}
