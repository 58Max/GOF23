package bridge;

//桥
public abstract class Computer {
    //品牌
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void info(){
        brand.info();
    }
}
