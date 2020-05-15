package principle.lsp.vehicle;

/**
 * 货车
 * @author long yun cai
 * @date 2020/5/15 14:57
 */
class Trucks extends Automobile {

    /**
     * 货车特有属性，货斗尺寸
     */
    void getPocketSize() {
        System.out.println("我是货车，货斗尺寸6m*2m*1.2m");
    }

}
