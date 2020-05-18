package principle.lsp.param;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 客户端
 * @Author long yun cai
 * @Date 2020/5/18 9:56
 */
public class Client {

    public static void main(String[] args) {
        invoker();

    }

    private static void invoker() {
        HashMap map = new HashMap(16);
        // 父类执行
        Father father = new Father();
        father.doSomething(map);
        // 父类出现的地方，子类就能出现
        Son son = new Son();
        son.doSomething(map);

    }

}
