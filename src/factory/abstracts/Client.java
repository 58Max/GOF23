package factory.abstracts;

public class Client {

    public static void main(String[] args) {
        System.out.println("===============小米系列产品==============");
        XiaoMiFactory xiaoMiFactory = new XiaoMiFactory();
        IphoneProduct xiaomiPhone = xiaoMiFactory.iphoneProduct();
        xiaomiPhone.callup();
        xiaomiPhone.sendMs();
        IRouterProduct xiaomiIRouter = xiaoMiFactory.irouterProduct();
        xiaomiIRouter.start();
        xiaomiIRouter.openWife();

        System.out.println("===============华为系列产品==============");
        HuaWeiFactory huaWeiFactory = new HuaWeiFactory();
        IphoneProduct huaweiPhone = huaWeiFactory.iphoneProduct();
        huaweiPhone.callup();
        huaweiPhone.sendMs();
        IRouterProduct huaweiIRouter = huaWeiFactory.irouterProduct();
        huaweiIRouter.start();
        huaweiIRouter.openWife();
    }
}
