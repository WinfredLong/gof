package principle.dip;

/**
 * 低层细节
 * @author long yun cai
 * @date 2020/5/15 16:53
 */
public class Audi implements ICar {
    @Override
    public void run() {
        System.out.println("奥迪汽车正在运行...");
    }
}
