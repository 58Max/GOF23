package factory.method;


/**
 * 工厂方法模式不许要修改代码只需要进行扩展就可以了
 */
public class Consumer {

    public static void main(String[] args) {

        Car car1 = new WulingFactory().getCar();
        Car car2 = new TeslaFactory().getCar();
    }
}
