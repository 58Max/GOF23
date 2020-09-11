package single;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 懒汉式单例
 * 线程不安全在并发情况下
 */
public class Lazy {

    private Lazy(){

    }

    private volatile static Lazy LAZY = null;  //加了volatile关键保证不会指令重排

//    public static Lazy getInstance(){
//
//        if(LAZY == null){
//            LAZY = new Lazy();
//        }
//        return LAZY;
//    }
    /**
     * DCL懒汉式模式
     * 双重检测锁模式
     */
    public static Lazy getInstance(){
        if(LAZY == null){
            synchronized (Lazy.class){
                if(LAZY == null)
                    LAZY = new Lazy();   //不是原子性操作
                /**
                 * 1 new 给对象分配内存空间
                 * 2 初始化对象
                 * 3 将引用指向该内存空间
                 * 会出现指令重排现象所以会导致单例变得不单例
                 */
            }
        }
        return LAZY;
    }

    /**
     * 反射 可以破坏单例
     */
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Lazy instance = Lazy.getInstance();
        Class clazz = instance.getClass();
        Constructor<Lazy> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Lazy instance1 = constructor.newInstance();
        System.out.println(instance);
        System.out.println(instance1);
    }
}
