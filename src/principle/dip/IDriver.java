package principle.dip;

/**
 * 驾驶员抽象
 * @author long yun cai
 * @date 2020/5/15 16:46
 */
public interface IDriver {

    /**
     * 抽象之间依赖，驾驶员驾驶汽车
     * @param iCar 汽车抽象
     */
    void driver(ICar iCar);

}
