package single;

/**
 * 饿汉式单例
 * 如果没有使用会造成浪费空间
 */
public class Hungry {

    private Hungry(){

    }
    private final static Hungry HUNGRY = new Hungry();

    public static Hungry getInstance(){
        return HUNGRY;
    }
}
