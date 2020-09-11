package builder;

public class Test {

    public static void main(String[] args) {

        //指挥
        Director director = new Director();

        //指挥 指挥建造者完成工作
        Product product = director.build(new Worker());

        System.out.println(product.toString());
    }
}
