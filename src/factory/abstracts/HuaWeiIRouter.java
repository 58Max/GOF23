package factory.abstracts;

public class HuaWeiIRouter implements IRouterProduct{
    @Override
    public void start() {
        System.out.println("开启华为Wife");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为Wife");
    }

    @Override
    public void openWife() {
        System.out.println("华为Wife开启");
    }

    @Override
    public void closeWife() {
        System.out.println("华为Wife关闭");
    }
}
