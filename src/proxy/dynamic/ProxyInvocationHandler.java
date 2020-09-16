package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 使用该类自动生成代理类
 */
public class  ProxyInvocationHandler implements InvocationHandler {

    private Object target;

    public void setProxy(Object target){
        this.target = target;
    }

    /**
     * 生成代理类
     * Proxy.newProxyInstance(this.getClass().getClassLoader(),
     * rent.getClass().getInterfaces(),this);
     * 参数一 类加载器
     * 参数二 被代理类实现的接口数组
     * 参数三 实现了InvocationHandler的代理类
     * @return 返回代理实例
     */

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);

    }

    /**
     * 处理代理实例并返回结果
     * @param proxy
     * @param method 反射的方法
     * @param args 反射的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质 使用反射机制实现
        Object object = method.invoke(target,args);
        return object;
    }
}
