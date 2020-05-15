package principle.lsp.vehicle;

/**
 * 小汽车
 * @author long yun cai
 * @date 2020/5/15 14:33
 */
class Car extends Automobile {

    /**
     * 小汽车特有属性，天窗尺寸
     */
    void getSkylightSize() {
        System.out.println("我是小汽车，天窗尺寸80cm*100cm");
    }

}
