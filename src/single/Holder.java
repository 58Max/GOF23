package single;

/**
 * 静态内部类实现单例模式
 */
public class Holder {

    private Holder(){

    }

    public static Holder getInstance(){
        return  Innerclass.HOLDER;
    }

    public static class Innerclass{
        private static final Holder HOLDER = new Holder();
    }

}
