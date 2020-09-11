package builder;

//抽象的建造者 ：方法

/**
 * 指的建造该产品需要的具体方法并交由工人实现
 */
public abstract class Builder {

    abstract  void BuildA(); //地基
    abstract  void BuildB(); //钢筋工程
    abstract  void BuildC(); //铺电线
    abstract  void BuildD(); //粉刷

    abstract  Product getProduct();
}
