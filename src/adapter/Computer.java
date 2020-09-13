package adapter;

import java.util.Collections;

/**
 * 客户端类 向上网 上不了网
 */
public class Computer {

    public void net(NetTOUsb adapter){
        adapter.handleRequest();
    }

    public static void main(String[] args) {
        //电脑 网线 适配器

        Computer computer = new Computer();
        Adaptee adaptee = new Adaptee();
//        Adapter adapter = new Adapter();
        Adapter2 adapter2 = new Adapter2(adaptee);
        computer.net(adapter2);
    }
}
