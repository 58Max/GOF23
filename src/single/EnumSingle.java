package single;

/**
 * 枚举单例模式
 * 枚举不能够被反射破坏
 */
public enum  EnumSingle {

    INSTANCE;

    private static EnumSingle getInstance(){
        return  INSTANCE;
    }


    public static void main(String[] args) {
        EnumSingle instance = EnumSingle.getInstance();
        EnumSingle instance2 = EnumSingle.getInstance();

        System.out.println(instance);
        System.out.println(instance2);
    }

}
