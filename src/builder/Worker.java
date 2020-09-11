package builder;

/**
 * 工人类
 * 用来实现对象的构建和初始化
 */
public class Worker extends Builder{

    private Product product;

    public Worker(){
        product = new Product();
    }
    @Override
    void BuildA() {
        product.setBuildA("地基");
        System.out.println(product.getBuildA());
    }

    @Override
    void BuildB() {
        product.setBuildB("钢筋");
        System.out.println(product.getBuildB());
    }

    @Override
    void BuildC() {
        product.setBuildC("铺电线");
        System.out.println(product.getBuildC());
    }

    @Override
    void BuildD() {
        product.setBuildD("粉刷");
        System.out.println(product.getBuildD());
    }

    @Override
    Product getProduct() {
        return product;
    }
}
