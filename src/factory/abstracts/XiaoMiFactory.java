package factory.abstracts;

public class XiaoMiFactory implements ProductFactory{
    @Override
    public IphoneProduct iphoneProduct() {
        return new XiaoMiPhone();
    }

    @Override
    public IRouterProduct irouterProduct() {
        return new XiaoMiIRouter();
    }
}
