package principle.lsp.vehicle;

/**
 * 汽车父类，本类只为说明里氏替换原则之父类出现的地方子类必定能够出现，不做属性行为分离
 * @author long yun cai
 * @date 2020/5/15 14:16
 */
class Automobile {

    /**
     * 汽车行驶
     */
    void run() {
        System.out.println("汽车行驶...");
    }

}
