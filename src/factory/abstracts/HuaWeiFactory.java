package factory.abstracts;

public class HuaWeiFactory implements ProductFactory{
    @Override
    public IphoneProduct iphoneProduct() {
        return new HuaWeiIPhone();
    }

    @Override
    public IRouterProduct irouterProduct() {
        return new HuaWeiIRouter();
    }
}
