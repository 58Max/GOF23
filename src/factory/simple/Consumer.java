package factory.simple;

public class Consumer {

    public static void main(String[] args) {
        //使用接口来实现 该实例只能够使用接口所有的方法
//        Car car1 = new Wuling();
//        Car car2 = new Tesla();

        //通过工厂来创建对象
        Car car1 = CarFactory.getCar("wuling");
        Car car2 = CarFactory.getCar("tesla");
    }
}
