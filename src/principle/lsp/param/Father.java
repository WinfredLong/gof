package principle.lsp.param;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 父类
 * @Author long yun cai
 * @Date 2020/5/18 9:50
 */
public class Father {

    public Map doSomething(HashMap hashMap) {
        System.out.println("父类执行...");
        return new HashMap(16);
    }

}
