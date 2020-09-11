package factory.simple;

/**
 * 简单工厂模式（静态工厂模式）
 * 当增加新的时需要修改代码
 */
public class CarFactory {

    //方法一
    public static Car getCar(String car){
        if(car.equals("wuling")){
            return  new Wuling();
        }else if(car.equals("tesla")){
            return new Tesla();
        }else
            return null;
    }

    //方法二
    public static Car getWuling(){
        return new Wuling();
    }
    public static Car getTesla(){
        return new Tesla();
    }

}
