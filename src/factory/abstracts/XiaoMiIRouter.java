package factory.abstracts;

public class XiaoMiIRouter implements IRouterProduct{
    @Override
    public void start() {
        System.out.println("开启小米Wife");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米Wife");

    }

    @Override
    public void openWife() {
        System.out.println("小米Wife开启");

    }

    @Override
    public void closeWife() {
        System.out.println("小米Wife关闭");
    }
}
