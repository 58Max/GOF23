package bridge;

public class Test {

    public static void main(String[] args) {
        //苹果笔记本
        Computer apple = new Laptop(new Apple());
        apple.info();
        //；联想台式机
        Computer lenvo = new Desktop(new Lenovo());
        lenvo.info();
    }
}
