package prototype.demo2;

import java.util.Date;

/**
 * 深克隆 需要重写clone()方法
 * 实现一个接口 Cloneable
 * 重写一个方法
 */
// 原型模式 + 工厂模式
public class Video implements Cloneable {

    private String name;
    private Date createTime;

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Object obj = super.clone();
        Video v = (Video) obj;
        //将对象的属性也进行克隆 但是存在一个问题 可能属性里面的对象实例也要被克隆
        v.createTime = (Date) this.createTime.clone();
        return obj;
    }

    public Video() {
    }

    public Video(String name, Date createTime) {
        this.name = name;
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
