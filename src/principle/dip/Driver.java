package principle.dip;

/**
 * 驾驶员 低层细节
 * @author long yun cai
 * @date 2020/5/15 16:50
 */
public class Driver implements IDriver {
    @Override
    public void driver(ICar iCar) {
        iCar.run();
    }
}
