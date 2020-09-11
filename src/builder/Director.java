package builder;

//建造者模式的核心
public class Director {

    //指挥按照某种顺序执行
    public Product build(Builder builder){
        builder.BuildA();
        builder.BuildB();
        builder.BuildC();
        builder.BuildD();
        return builder.getProduct();
    }

}
