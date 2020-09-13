package adapter;

//适配器

/**
 * 类适配器
 */
public class Adapter extends Adaptee implements  NetTOUsb {
    @Override
    public void handleRequest() {
        super.request();
    }
}
