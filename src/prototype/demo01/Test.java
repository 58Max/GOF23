package prototype.demo01;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        Date date = new Date();
        Video v1 = new Video("58max",date);

        System.out.println(v1.getCreateTime());
        System.out.println(v1.hashCode());


        /**
         * v2 是 v1 的克隆对象（浅克隆）
         * v2 和 v1中的引用指向的实例对象是一致的 比如 Video中的date对象
         * 就是 当修改其中一个中的对象引用的值两者的都会发生改变
         * 但是hashcode值是不一样
         */
        Video v2 = (Video) v1.clone();
        System.out.println(v2.getCreateTime());
        System.out.println(v2.hashCode());


        TimeUnit.SECONDS.sleep(3);

        /**
         * 通过v2修改了date实例但是v1也发生了改变
         */
        v2.getCreateTime().setTime(1111111);

        System.out.println(v1.getCreateTime());
        System.out.println(v2.getCreateTime());

    }
}
