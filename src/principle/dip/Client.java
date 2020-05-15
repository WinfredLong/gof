package principle.dip;

/**
 * 客户端，高层使用
 * @author long yun cai
 * @date 2020/5/15 16:55
 */
public class Client {

    public static void main(String[] args) {
        // 表面类型IDriver,实际类型Driver
        IDriver sanMao = new Driver();
        // 表面类型ICar,实际类型Audi
        ICar audi = new Audi();
        // 表面类型ICar,实际类型Benz
        ICar benz = new Benz();
        // 抽象之间依赖
        sanMao.driver(audi);
        sanMao.driver(benz);
    }

}
