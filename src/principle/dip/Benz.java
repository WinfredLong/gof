package principle.dip;

/**
 * 低层细节
 * @author long yun cai
 * @date 2020/5/15 16:54
 */
public class Benz implements ICar {
    @Override
    public void run() {
        System.out.println("奔驰汽车正在运行...");
    }
}
