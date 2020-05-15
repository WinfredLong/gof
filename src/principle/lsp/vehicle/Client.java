package principle.lsp.vehicle;

/**
 * 客户端
 * @author long yun cai
 * @date 2020/5/15 14:41
 */
public class Client {

    public static void main(String[] args) {
        // 使用父类
        Automobile automobile = new Automobile();
        automobile.run();
        // 父类出现的地方，都可以使用子类Car
        Car car = new Car();
        car.run();
        // 父类出现的地方，都可以使用子类Trucks
        Trucks trucks = new Trucks();
        trucks.run();
        // 子类可以拥有自己独立的行为属性
        car.getSkylightSize();
        trucks.getPocketSize();
    }

}
